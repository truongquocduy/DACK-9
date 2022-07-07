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
    //Intergation Test 28 - Thay đổi số lượng sản phẩm trong giỏ hàng
    @Test
    public static void IT28() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(2000);

            //Thêm sản phẩm vào giỏ hàng
            driver.findElement(By.xpath("//div[7]/div[1]/div[2]/div[1]/h3[1]/a[1]")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id='add-to-cart']")).click();
            Thread.sleep(2000);

            //Bấm xem giỏ hàng
            driver.findElement(By.xpath("//tr[2]/td[1]/a[1]")).click();
            Thread.sleep(2000);

            //Tăng số lượng sản phẩm + 2
            driver.findElement(By.xpath("//div[1]/button[2]")).click();
            driver.findElement(By.xpath("//div[1]/button[2]")).click();
            Thread.sleep(2000);

            //Giảm số lượng -1
            driver.findElement(By.xpath("//div[2]/div[1]/button[1]")).click();
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}