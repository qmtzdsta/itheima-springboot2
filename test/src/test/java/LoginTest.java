import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @Before
    public void setup() {
        // 设置ChromeDriver路径
        System.setProperty("webdriver.chrome.driver", "F:\\chrome driver\\chromedriver.exe");

        // 创建ChromeDriver实例
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin() {
        // 打开登录页面
        driver.get("http://localhost:8080/test/login.jsp");

        // 输入用户名和密码
        WebElement usernameInput = driver.findElement(By.name("username"));
        usernameInput.sendKeys("jack");
        WebElement passwordInput = driver.findElement(By.name("password"));
        passwordInput.sendKeys("123");

        // 提交表单
        WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        submitButton.click();

        // 验证登录结果
        WebElement resultElement = driver.findElement(By.tagName("body"));
        String resultText = resultElement.getText();
        if (resultText.contains("Login successful")) {
            System.out.println("Login test passed");
        } else {
            System.out.println("Login test failed");
        }
    }

    @After
    public void tearDown() {
        // 关闭浏览器
        driver.quit();
    }
}
