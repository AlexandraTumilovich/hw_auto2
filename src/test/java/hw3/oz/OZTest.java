package hw3.oz;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/*
1. Открываем oz.by
2. Проверяем, что элементы поле поиска, Войти и Корзина кнопки, фильтры слева отображаются на странице
3. Тест реализовать через Page Object паттерн
 */

public class OZTest {
    private OZ oz;

    @BeforeClass
    public void before() {
        oz = new OZ();
    }

    @Test
    public void test() {
        Assert.assertTrue(oz.checkSearchField());
        Assert.assertTrue(oz.checkFilters());
        Assert.assertTrue(oz.checkShopingCart());
        Assert.assertTrue(oz.checkSingIN());
    }

    @AfterClass
    public void tearDown() {
        oz.close();
    }

}