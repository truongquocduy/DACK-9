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
    //Intergation Test 21 - Tìm kiếm thấy sản phẩm
    @Test
    public static void IT21(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //1. Goto https://funandpeace.vn/
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(2000);
            //2. Bấm vào biểu tượng search trên navbar
            driver.findElement(By.xpath("//*[@id=\"site-search-handle\"]/a")).click();
            Thread.sleep(2000);
            //3. Điền tìm sản phẩm
            driver.findElement(By.xpath("//*[@id=\"inputSearchAuto\"]")).sendKeys("NON ESSENTIAL");
            Thread.sleep(3000);
            //4. Click vào sản phẩm đầu tiên trả về
            driver.findElement(By.xpath("//*[@id=\"ajaxSearchResults\"]/div/div[1]/div[2]/a")).click();
            Thread.sleep(2000);


        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}