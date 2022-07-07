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
    // Intergation Test 8 - Đăng kí nhận tin
    @Test
    public static void IT8(){
        WebDriver driver = driverFactory.getChromeDriver();
        try{
            String email = "test00@gmail.com";

            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(1000);
            driver.findElement( By.xpath("//div[1]/div[1]/div[1]/form[1]/div[1]/input[2]")).sendKeys(email);
            Thread.sleep(2000);
            driver.findElement( By.xpath("//div[1]/form[1]/div[1]/button[1]")).click();
            Thread.sleep(4000);

        }catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
}