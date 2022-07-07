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
    @Test
    //Intergation Test 01 - Đăng ký tài khoản
    public static void IT1(){
        WebDriver driver = driverFactory.getChromeDriver();
        try{
            String email = "test000@gmail.com";
            String password = "123456";

            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            //Nhấn vào icon đăng nhập
            Thread.sleep(2000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 488.9 488.9\")]")).click();
            //Nhấn vào nut đăng ký
            Thread.sleep(2000);
            driver.findElement( By.xpath("//div[4]/div[2]/a[2]")).click();
            Thread.sleep(2000);
            //Tiến hành đăng ký
            driver.findElement(By.xpath("//div[2]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Nguyễn");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[2]/input[1]")).sendKeys("Văn A");
            Thread.sleep(1000);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//form[1]/div[4]/input[1]")).sendKeys("01/01/2002");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//form[1]/div[5]/input[1]")).sendKeys(email);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//form[1]/div[6]/input[1]")).sendKeys(password);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[2]/div[1]/form[1]")).submit();
            Thread.sleep(3000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}