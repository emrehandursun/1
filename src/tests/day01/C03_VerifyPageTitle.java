package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {

    public static void main(String[] args) throws InterruptedException {
        //Yeni bir class oluşturalım(verifytitle)
        //Amazon ana sayfasina gidelim. https://www.amazon.com/

        System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)

        String expectedTitle="amazon";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen deger ile ayni, test PASS");
        }else{
            System.out.println("title beklenenden farkli, test FAILED");
            System.out.println("aktuel title : " + driver.getTitle());
        }

        driver.close();
    }
}
