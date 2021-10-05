package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1.Yeni bir class olusturalim (Homework)
2.ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
yazdirin.
4.https://www.walmart.com/ sayfasina gidin.
5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
6. Tekrar “facebook” sayfasina donun
7. Sayfayi yenileyin
8. Sayfayi tam sayfa (maximize) yapin
9.Browser’i kapatin

 */

public class odev2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Documents/selenium dependencies/drivers/chromedriver.exe");
        /*
            1.Yeni bir class olusturalim (Homework)
            2.ChromeDriver kullanara, facebook sayfasina gidin ve sayfa basliginin (title) “facebook”
            oldugunu dogrulayin (verify), degilse dogru basligi yazdirin.
            3.Sayfa URL’inin “facebook” kelimesi icerdigini dogrulayin, icermiyorsa “actual” URL’i
            yazdirin.
         */

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        String expectedTitle="facebook";
        Thread.sleep(2000);
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen deger ile ayni, test PASS");
        }else{
            System.out.println("title beklenenden farkli, test FAILED");
            System.out.println("aktuel title : " + driver.getTitle());
        }
        /*
        4.https://www.walmart.com/ sayfasina gidin.
        5. Sayfa basliginin “Walmart.com” icerdigini dogrulayin.
        */

        driver.get("https://www.walmart.com");
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl ="www.walmart.com";

        if(actualUrl.equals(expectedUrl)){
            System.out.println("Pass gecti");
        }

        else {
            System.out.println("Fail oldu malesef :)");
            System.out.println("Actual yani mevcut urlmiz : " + actualUrl);
            System.out.println("Expected yani beklenen urlmiz : " + expectedUrl);
        }
        /*
        6. Tekrar “facebook” sayfasina donun
        7. Sayfayi yenileyin
        8. Sayfayi tam sayfa (maximize) yapin
        9.Browser’i kapatin
         */
        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.quit();

    }
}
