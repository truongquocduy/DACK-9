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
    // Intergation Test 14 - Lọc sản phẩm theo giá sản phẩm
    @Test
    public static void IT14(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //1. Goto https://funandpeace.vn/
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(2000);
            //2. bấm vào trang sản phẩm
            driver.findElement(By.xpath("//*[@id=\"fun-and-peace\"]/div[1]/div[1]/div/header/div/div/div[2]/div/nav/ul/li[2]/a")).click();
            Thread.sleep(2000);
            //3. Chọn Khoảng giá
            driver.findElement(By.xpath("//*[@id=\"collection-body\"]/div[1]/div/div/div/div/div[2]/div/div[2]/div[2]/ul/li[2]/label")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"collection-body\"]/div[1]/div/div/div/div/div[2]/div/div[2]/div[2]/ul/li[2]/label")).click();
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}