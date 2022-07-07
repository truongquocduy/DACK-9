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
    //Intergation Test 20 - Thanh toán
    @Test
    public static void IT20(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(2000);

            //Thêm sản phẩm vào giỏ hàng
            driver.findElement(By.xpath("//div[6]/div[1]/div[2]/div[1]/h3[1]/a[1]")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("//*[@id='add-to-cart']")).click();
            Thread.sleep(2000);

            //Bấm xem giỏ hàng
            driver.findElement(By.xpath("//tr[2]/td[1]/a[1]")).click();
            Thread.sleep(2000);

            //Quay về trang chủ
            driver.findElement(By.xpath("//nav[1]/ul[1]/li[1]/a[1]")).click();
            Thread.sleep(2000);

            //Bấm vào icon giỏ hàng
            driver.findElement(By.xpath("//*[contains(@height, \"456pt\")]")).click();
            Thread.sleep(2000);

            //Bấm thanh toán
            driver.findElement(By.xpath("//tr[2]/td[2]/a[1]")).click();
            Thread.sleep(2000);

            //Nhập thông tin thanh toán
            driver.findElement(By.xpath("//*[@id='billing_address_full_name']")).sendKeys("Jonh Cena");
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id='checkout_user_email']")).sendKeys("test000@gmail.com");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='billing_address_phone']")).sendKeys("0123456789");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id='billing_address_address1']")).sendKeys("11AA, Phan Đăng Lưu");
            Thread.sleep(1000);

            WebElement thanhpho = driver.findElement(By.xpath("//*[@id='customer_shipping_province']"));
            Select selectThanhPho = new Select(thanhpho);
            selectThanhPho.selectByVisibleText("Hồ Chí Minh");
            Thread.sleep(1000);

            WebElement quan = driver.findElement(By.xpath("//*[@id='customer_shipping_district']"));
            Select selectQuan = new Select(quan);
            selectQuan.selectByVisibleText("Quận Phú Nhuận");
            Thread.sleep(1000);

            WebElement phuong = driver.findElement(By.xpath("//*[@id='customer_shipping_ward']"));
            Select selectPhuong = new Select(phuong);
            selectPhuong.selectByVisibleText("Phường 07");
            Thread.sleep(1000);

            //Nhấn Tiếp tục đến phương thúc thanh toán
            driver.findElement(By.xpath("//*[@id='form_next_step']/button[1]")).click();
            Thread.sleep(2000);

            //Bấm vào Hoàn tất đơn hàng
            driver.findElement(By.xpath("//form[1]/button[1]")).click();
            Thread.sleep(2000);

            //Lấy mã hóa đơn
            String mahoadon = driver.findElement(By.xpath("//div[1]/div[1]/span[1]")).getText();
            Thread.sleep(1000);
            //Lấy tổng tiền
            String tongtien = driver.findElement(By.xpath("//tfoot[1]/tr[1]/td[2]/span[2]")).getText();
            Thread.sleep(1000);
            System.out.println("Mã hóa đơn là: " + mahoadon);
            System.out.println("Tổng tiền: " + tongtien);
            Thread.sleep(2000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }


}