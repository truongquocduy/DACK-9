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
    //Intergation Test 19 - Thêm sản phẩm vào giỏ hàng - hết hàng
    @Test
    public static void IT19() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(2000);

            //Nhấp vào sản phẩm hết hàng
            driver.findElement(By.xpath("//div[5]/div[1]/div[2]/div[1]/h3[1]/a[1]")).click();
            Thread.sleep(2000);
            //Click thêm vào giỏ hàng
            driver.findElement(By.xpath("//div[1]/button[1]/span[1]")).click();
            String hethang = driver.findElement(By.xpath("//div[1]/button[1]/span[1]")).getText();
            System.out.println(hethang);
            Thread.sleep(2000);

        }
        catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}