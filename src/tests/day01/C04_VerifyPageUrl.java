package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com/");

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl ="www.techproeducation.com";

        if(actualUrl.equals(expectedUrl)){
            System.out.println("Pass gecti");
        }

        else {
            System.out.println("Fail oldu malesef :)");
            System.out.println("Actual yani mevcut urlmiz : " +actualUrl);
            System.out.println("Expected yani beklenen urlmiz : " + expectedUrl);

        }

    }
}