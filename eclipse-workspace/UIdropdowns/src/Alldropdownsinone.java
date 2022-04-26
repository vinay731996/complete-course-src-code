import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Alldropdownsinone {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("autosuggest")).sendKeys("ind");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();

				break;
			}
		}

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"))
				.click();// without Index

		// with index
		// driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

		// handling calender selecting the present date

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();

//validing if UI Elements ard disabled or enabled with attribute

		/*
		 * System.out.println(
		 * driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());//it
		 * give false but it showing true
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 * System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).
		 * isEnabled());
		 */

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // to pull attribute
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.print("it is enabled");
		}

		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();

		}
		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select dropdown = new Select(staticdropdown);
		System.out.println(dropdown.getFirstSelectedOption().getText());

		// one way
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		// second way
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		// thirdway
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());

		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

		// count no of checkbox

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

		System.out.println("complete process is done");

		driver.quit();
	}

}
