package hw3.listener;

/*
1. Написать 4 автотеста, 2 из них - passed, 1 - failed, 1 - skipped.
2. Подключить ITestListener, и в методах этого листенера вывести данные по результатам тестов (какие прошли, какие нет).
3. Подключить репортер
4. Запустить через testng.xml и убедиться, что статистика по прогону вывелась, а репорт сгенерился.
 */

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class MyTest {

    @Test
    public void test1() {
        int a = 3;
        int b = 5;
        Assert.assertEquals(b - a, 2);
    }

    @Test
    public void test2() {
        int a = 2;
        int b = 2;
        Assert.assertEquals(a, b);
    }

    @Test()
    public void test3() {
        throw new SkipException("This test is skipped");
    }

    @Test
    public void test4() {
        Assert.fail();
    }
}
