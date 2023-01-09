package testingassignment.staffbasetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class test {
    public static void main(String[] args) {
        // Set up the Chrome driver
        System.setProperty("webdriver.chrome.driver", "C:\\Windows.old\\Users\\HARISH C\\eclipse-workspace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Navigate to the Staffbase website
        driver.get("https://staffbase.com/jobs/quality-assurance-engineer-2021_1730");

        // Wait for the cookie banner to be displayed
        WebElement cookieBanner = driver.findElement(By.cssSelector(".optanon-alert-box-button-middle"));
        cookieBanner.click();

        // At this point, the cookie banner should no longer be displayed, and the test can continue with other actions
        // Click on apply button to take us to the apply page(apply via linkd in is covered later)
        WebElement applyfields = driver.findElement(By.className("inline-flex items-center justify-center rounded bg-yellow-staffbase py-3 px-4 font-semibold uppercase transition duration-200 hover:bg-yellow-400 focus:outline-none focus:ring focus:ring-yellow-400 focus:ring-offset-2").click());
        // Fill out the form
        WebElement firstNameField = driver.findElement(By.name("job_application[first_name]"));
        firstNameField.sendKeys("harish");

        WebElement lastNameField = driver.findElement(By.name("job_application[last_name]"));
        lastNameField.sendKeys("chidanand");
        
        WebElement emailField = driver.findElement(By.name("job_application[email]"));
        emailField.sendKeys("123@gmail.com");
        
        WebElement phoneField = driver.findElement(By.name("job_application[phone]"));
        phoneField.sendKeys("015212995422");
        
        
        WebElement cvField = driver.findElement(By.class("unstyled-button link-button"));
        cvField.sendKeys("C:\\Users\\haris\\Desktop\\Files\\cv.pdf");
        
        WebElement coverletterField = driver.findElement(By.class("unstyled-button link-button"));
        coverletterField.sendKeys("C:\\User\\haris\\Desktop\\Files\\coverletter.pdf");
        
        WebElement internationalField = driver.findElement(By.name("job_application[answers_attributes][0][text_value]"));
        internationalField.sendKeys("yes");
        
        Select dropdwn = new Select(driver.findElement(By.id("select2-drop-mask")));
        dropdwn.selectByVisibleText("Yes");
        
        WebElement skillsField = driver.findElement(By.name("job_application[answers_attributes][2][text_value]"));
        skillsField.sendKeys("https://github.com/harishchidanandappa/staffbasetest");

       

        // Submit the form
        WebElement submitButton = driver.findElement(By.id("submit_app"));
        submitButton.click();

        
    }
}