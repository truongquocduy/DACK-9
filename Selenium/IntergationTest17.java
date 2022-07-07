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
    //Intergation Test 17 - Xem bài viết
    @Test
    public static void IT17(){
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //1. Goto https://funandpeace.vn/
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(2000);
            //2. Chọn menu blogs
            driver.findElement(By.xpath("//*[@id=\"fun-and-peace\"]/div[1]/div[1]/div/header/div/div/div[2]/div/nav/ul/li[3]/a")).click();
            Thread.sleep(2000);
            //3. Chọn 1 bài biết bất kì
            driver.findElement(By.xpath("//*[@id=\"blog\"]/div[3]/div/div[2]/div[2]/div[1]/article[1]/div/div[2]/h3/a")).click();
            Thread.sleep(5000);
            //4. Trả về đúng bài viết đó
            String checksp = driver.findElement(By.xpath("//*[@id=\"article\"]/div[3]/div/div[2]/div/div/div[1]/h1")).getText();
            Thread.sleep(10000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}