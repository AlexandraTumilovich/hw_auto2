package hw3.oz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class OZ {
    private WebDriver driver;

    @FindBy(xpath = "//input[@id=\"top-s\"]")
    private WebElement searchField;
    @FindBy(xpath = "//*[@id=\"top-page\"]/div[1]/div[2]/div/ul/li[2]/a/span[1]")
    private WebElement singIN;
    @FindBy(xpath = "//a[@class=\"top-panel__userbar__cart__item\"]")
    private WebElement shopingCart;
    @FindBy(xpath = "//a[@class=\"menu-link-action main-nav__list__item \"]")
    private List<WebElement> filters;

    {
        driver = new ChromeDriver();
        driver.get("https://oz.by/");
        driver.manage().window().maximize();
    }

    public OZ() {
        PageFactory.initElements(driver, this);
    }

    public boolean checkSearchField() {
        return searchField.isDisplayed();
    }

    public boolean checkSingIN() {
        return singIN.isDisplayed();
    }

    public boolean checkShopingCart() {
        return shopingCart.isDisplayed();
    }

    public boolean checkFilters() {
        boolean filtersIsShown = false;
        ArrayList<String> expectedResults = new ArrayList<>();
        expectedResults.add("Продукты, деликатесы");
        expectedResults.add("Книги");
        expectedResults.add("Косметика, парфюмерия");
        expectedResults.add("Дом, сад, зоотовары");
        expectedResults.add("Развлечения, творчество");
        expectedResults.add("Канцтовары, учёба");
        expectedResults.add("Сувениры, подарки");
        expectedResults.add("Детям и мамам");
        expectedResults.add("Туризм, отдых, спорт");
        expectedResults.add("Техника, электроника");
        expectedResults.add("Здоровье, медтехника");
        ArrayList<String> actualResults = new ArrayList<>();
        for (int i = 0; i < filters.size(); i++) {
            actualResults.add(filters.get(i).getText());
        }
        if (expectedResults.containsAll(actualResults) && expectedResults.size() == actualResults.size()) {
            filtersIsShown = true;
        }
        return filtersIsShown;
    }

    public void close() {
        driver.quit();
    }
}
