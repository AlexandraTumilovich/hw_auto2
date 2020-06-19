package hw3.listener;
/*
1. Написать 4 автотеста, 2 из них - passed, 1 - failed, 1 - skipped.
2. Подключить ITestListener, и в методах этого листенера вывести данные по результатам тестов (какие прошли, какие нет).
3. Подключить репортер
4. Запустить через testng.xml и убедиться, что статистика по прогону вывелась, а репорт сгенерился.
 */

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Before tests...");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test case with name " + result.getName() + " started!");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test case with name " + result.getName() + " success!");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test case with name " + result.getName() + " failed!");
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test case with name " + result.getName() + " skipped!");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("After all tests...");
    }
}
