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
    //Intergation Test 18 - Thêm sản phẩm vào giỏ hàng - còn hàng
    @Test
    public static void IT18() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(2000);

            //Nhấp vào sản phẩm còn hàng
            driver.findElement(By.xpath("//div[7]/div[1]/div[2]/div[1]/h3[1]/a[1]")).click();
            Thread.sleep(2000);
            //Lấy tên sản phẩm
            String tensanpham = driver.findElement(By.xpath("//h1[1]")).getText();
            //Lấy giá sản phẩm
            String giasanpham = driver.findElement(By.xpath("//div[2]/div[2]/span[1]")).getText();
            Thread.sleep(1000);
            //Thay đổi số lượng
            driver.findElement(By.xpath("//*[@id='quantity']")).clear();
            driver.findElement(By.xpath("//*[@id='quantity']")).sendKeys("1");
            Thread.sleep(1000);
            //Click button Thêm vào giỏ hàng
            driver.findElement(By.xpath("//*[@id='add-to-cart']")).click();
            Thread.sleep(2000);
            //Click xem giỏ hàng
            driver.findElement(By.xpath("//tr[2]/td[1]/a[1]")).click();
            Thread.sleep(2000);
            //Lấy tên sản phẩm trong giỏ hàng
            String tengiohang = driver.findElement(By.xpath("//a[1]/h3[1]")).getText();
            //Lấy giá sản phẩm trong giỏ hàng
            String giagiohang = driver.findElement(By.xpath("//div[3]/p[1]/span[1]")).getText();
            Thread.sleep(2000);
            assertEquals(tensanpham, tengiohang);
            assertEquals(giasanpham, giagiohang);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}