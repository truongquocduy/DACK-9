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
    // Intergation Test 12 - Lọc sản phẩm theo danh sách hiển thị
    @Test
    public static void IT12(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //1. Goto https://funandpeace.vn/
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(2000);
            //2. bấm vào trang sản phẩm
            driver.findElement(By.xpath("//nav[1]/ul[1]/li[2]/a[1]")).click();
            Thread.sleep(2000);
            //3.bấm vào mục lọc
            WebElement loc = driver.findElement(By.xpath("//select[1]"));
            Select selectGiamdan = new Select(loc);
            selectGiamdan.selectByVisibleText("Giá: Giảm dần");
            Thread.sleep(4000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}