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
    //Intergation Test 03 - Đăng nhập
    @Test
    public static void IT3(){
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
            //Tiến hành đăng nhập
            driver.findElement(By.xpath("//div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys(email);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//form[1]/div[2]/input[1]")).sendKeys(password);
            Thread.sleep(1000);
            driver.findElement(By.xpath("//div[2]/div[1]/div[1]/form[1]")).submit();
            Thread.sleep(3000);
            assertEquals(email,driver.findElement(By.xpath("//div[2]/div[1]/div[1]/p[2]")).getText());

        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    // Intergation Test 8 - Đăng kí nhận tin
    @Test
    public static void IT8(){
        WebDriver driver = driverFactory.getChromeDriver();
        try{
            String email = "test00@gmail.com";

            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(1000);
            driver.findElement( By.xpath("//div[1]/div[1]/div[1]/form[1]/div[1]/input[2]")).sendKeys(email);
            Thread.sleep(2000);
            driver.findElement( By.xpath("//div[1]/form[1]/div[1]/button[1]")).click();
            Thread.sleep(4000);

        }catch (Exception e) {
            e.printStackTrace();
        }

        driver.quit();
    }
    // Intergation Test 010 - Liên hệ
    @Test
    public static void IT10(){
        WebDriver driver = driverFactory.getChromeDriver();
        try{
            String email = "test000@gmail.com";
            String password = "123456";

            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(1000);
            //Nhấn liên hệ menu
            driver.findElement( By.xpath("//nav[1]/ul[1]/li[5]/a[1]")).click();
            Thread.sleep(2000);

            driver.findElement( By.xpath("//div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Nguyễn Văn A");
            Thread.sleep(1000);
            driver.findElement( By.xpath("//div[1]/div[1]/div[2]/div[1]/input[1]")).sendKeys(email);
            Thread.sleep(1000);
            driver.findElement( By.xpath("//div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("0123456789");
            Thread.sleep(1000);
            driver.findElement( By.xpath("//div[1]/div[1]/div[4]/div[1]/textarea[1]")).sendKeys("Sorry, I'm studying Tester");
            Thread.sleep(1000);
            driver.findElement( By.xpath("//div[1]/div[1]/div[6]/button[1]")).click();
            Thread.sleep(3000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

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
    // Intergation Test 13 - Lọc sản phẩm theo thương hiệu
    @Test
    public static void IT13(){
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
            //3. Chọn thương hiệu FAP
            driver.findElement(By.xpath("//*[@id=\"collection-body\"]/div[1]/div/div/div/div/div[2]/div/div[1]/div[2]/ul/li/label")).click();
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

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

    // Intergation Test 15 - Lọc sản phẩm sắp xếp theo màu sắc
    @Test
    public static void IT15(){
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
            //3. Chọn màu sắc
            driver.findElement(By.xpath("//*[@id=\"collection-body\"]/div[1]/div/div/div/div/div[2]/div/div[3]/div[2]/ul/li[8]/label")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"collection-body\"]/div[1]/div/div/div/div/div[2]/div/div[3]/div[2]/ul/li[8]/label")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"collection-body\"]/div[1]/div/div/div/div/div[2]/div/div[3]/div[2]/ul/li[5]/label")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"collection-body\"]/div[1]/div/div/div/div/div[2]/div/div[3]/div[2]/ul/li[5]/label")).click();
            Thread.sleep(4000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    // Intergation Test 16 - Lọc sản phẩm theo kích thước
    @Test
    public static void IT16(){
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
            //3. Chọn kích thước
            driver.findElement(By.xpath("//*[@id=\"collection-body\"]/div[1]/div/div/div/div/div[2]/div/div[4]/div[2]/ul/li[2]/label")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"collection-body\"]/div[1]/div/div/div/div/div[2]/div/div[4]/div[2]/ul/li[2]/label")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"collection-body\"]/div[1]/div/div/div/div/div[2]/div/div[4]/div[2]/ul/li[3]/label")).click();
            Thread.sleep(4000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

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

    //Intergation Test 22 - Tìm kiếm không thấy sản phẩm
    @Test
    public static void IT22(){
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
            driver.findElement(By.xpath("//*[@id=\"inputSearchAuto\"]")).sendKeys("ZZZZ");
            Thread.sleep(3000);
            //4. Trả về không có sản phẩm nào
            String checksp = driver.findElement(By.xpath("//*[@id=\"ajaxSearchResults\"]/div/p")).getText();
            Thread.sleep(2000);

            System.out.println(checksp);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

    // Intergation Test 24 - Xem thông tin sản phẩm hết hàng
    @Test
    public static void IT24(){
        WebDriver driver = driverFactory.getChromeDriver();
        try{

            //Truy cập vào trang chủ
            driver.get("https://funandpeace.vn/");
            //chở 4 giây để tắt quảng cáo
            Thread.sleep(4000);
            driver.findElement( By.xpath("//*[contains(@viewBox, \"0 0 512.001 512.001\")]")).click();
            Thread.sleep(1000);
            //Nhấn sản phẩm hết hàng
            driver.findElement( By.xpath("//div[5]/div[1]/div[2]/div[1]/h3[1]/a[1]")).click();
            Thread.sleep(2000);
            assertEquals("Hết hàng",driver.findElement(By.xpath("//div[2]/div[1]/span[1]")).getText());
            Thread.sleep(2000);
            System.out.println("hoán thành");
        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

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
    

    //Intergation Test 27 - Xóa sản phẩm trong giỏ hàng
    @Test
    public static void IT27() {
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

            //click remove san pham
            driver.findElement(By.xpath("//div[1]/div[2]/div[4]/div[2]/a[1]/img[1]")).click();
            Thread.sleep(2000);
            String giohang = driver.findElement(By.xpath("//div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
            System.out.println(giohang);
            Thread.sleep(4000);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }

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
