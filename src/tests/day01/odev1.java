package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/*      1. Yeni bir class olusturun (TekrarTesti)
        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        URL'yi yazdırın.
        4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/
        5. Youtube sayfasina geri donun
        6. RefrSayfayi yenileyin
        7. Amazon sayfasina donun
        8. Sayfayi tamsayfa yapin
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        11.Sayfayi kapatin */

public class odev1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/ADMIN/Documents/selenium dependencies/drivers/chromedriver.exe");
        /*
        2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın
        (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.
        3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru
        URL'yi yazdırın.
        */
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        String expectedTitle="youtube";
        Thread.sleep(2000);
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("title beklenen deger ile ayni, test PASS");
        }else{
            System.out.println("title beklenenden farkli, test FAILED");
            System.out.println("aktuel title : " + driver.getTitle());
        }


        driver.get("https://www.amazon.com");
        /*
        5. Youtube sayfasina geri donun
        6. RefrSayfayi yenileyin
        7. Amazon sayfasina donun
        8. Sayfayi tamsayfa yapin
        */
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().forward();
        driver.manage().window().maximize();
        /*
        9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa
        doğru başlığı(Actual Title) yazdırın.
        10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru
        URL'yi yazdırın
        11.Sayfayi kapatin
         */
        String expectedTitle2 = "Amazon";
        String actualTitle2 = driver.getTitle();
        if (expectedTitle.equals(actualTitle2)){
                System.out.println("title beklenen deger ile ayni, test PASS");
            }else {
            System.out.println("title beklenenden farkli, test FAILED");
            System.out.println("aktuel title : " + driver.getTitle());
            driver.get("https://www.amazon.com");
        }
        driver.close();
    }
}
