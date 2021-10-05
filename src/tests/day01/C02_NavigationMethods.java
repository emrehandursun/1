package tests.day01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class C02_NavigationMethods {
    //1. yeni bir class oluşturalım(NavigationMethots)

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/Documents/selenium dependencies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
    //2. techproed ana sayfasina gidelim . https://www.techproeducation.com/
        for (String s : Arrays.asList("https://www.techproeducation.com", "https://www.amazon.com")) {
            driver.navigate().to(s);
        }
        //3. Amazon soyfasina gidelim. https://www.amazon.com/
        //4. Tekrar techproeducation sayfasina donelim
        driver.navigate().back();
        //5. Yeniden Amazon sayfasina gidelim
        driver.navigate().forward();
        //6. Sayfayi Refresh(yenile) yapalim
        driver.navigate().refresh();
        //7. Sayfayi tam ekran yapalim
        driver.manage().window().maximize();
        //8. Sayfayi kapatalim / Tum sayfalari kapatalim
        driver.close();

    }

}
