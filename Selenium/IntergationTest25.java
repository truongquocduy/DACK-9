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
    //Intergation Test 25 - Thay đổi thumbnail
    @Test
    public static void IT25() {
        //1. Init web-driver session
        WebDriver driver = driverFactory.getChromeDriver();
        try{
            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(2000);

            //Step 2. Nhấp vào 1 sản phẩm bất kì
            driver.findElement(By.xpath("//div[5]/div[1]/div[2]/div[1]/h3[1]/a[1]")).click();
            Thread.sleep(2000);
            System.out.println(driver.findElement(By.xpath("//h1[1]")).getText());
            Thread.sleep(2000);
            //Steo 3. Nhấp vào thumbnail
            driver.findElement(By.xpath("//div[2]/a[1]/img[1]")).click();
            Thread.sleep(2000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        driver.quit();
    }
}