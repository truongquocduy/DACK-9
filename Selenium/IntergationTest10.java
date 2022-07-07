package baitap;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class DACK {
    // Intergation Test 010 - Liên hệ
    @Test
    public static void IT10(){
        WebDriver driver = driverFactory.getChromeDriver();
        try{
            String email = "test000@gmail.com";
            String password = "123456";

            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(1000);
            //Nhấn liên hệ menu
            driver.findElement( By.xpath("//nav[1]/ul[1]/li[5]/a[1]")).click();
            Thread.sleep(2000);

            driver.findElement( By.xpath("//div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Nguyễn Văn A");
            Thread.sleep(1000);
            driver.findElement( By.xpath("//div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(email);
            Thread.sleep(1000);
            driver.findElement( By.xpath("//div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("0123456789");
            Thread.sleep(1000);
            driver.findElement( By.xpath("//div[1]/div[1]/div[4]/div[1]/textarea[1]")).sendKeys("Sorry, I'm studying Tester");
            Thread.sleep(1000);
            driver.findElement( By.xpath("//div[1]/div[1]/div[6]/button[1]")).click();
            Thread.sleep(3000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}