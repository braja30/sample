package pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base1 extends Pom_elements_Ortho{
	public static WebDriver driver; // driver initialization 
	public static Properties p ;
	public static Actions act;
	public static WebDriver getDriver(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\chromedriver.exe");	
			driver =new ChromeDriver();
			act = new Actions(driver);
			driver.manage().window().maximize();	
		} else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Users\\Lenovo\\eclipse-workspace\\Selenium_Testing\\Driver\\geckodriver.exe");	   
			driver =new FirefoxDriver();
			driver.manage().window().maximize();
		} 
		return driver;
	}
	public static Properties getObjectRepositary(String Path) throws IOException {
		FileInputStream f = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Cucumber"+Path);
		p = new Properties();
		p.load(f);
		return p;
	}
	public static void impWait(int a) { 
		driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
	}
	public static void expWait_clickable(WebElement element, int b) {
		WebDriverWait wait= new WebDriverWait (driver,b);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	public static void sleep(int a) throws InterruptedException {
		Thread.sleep(a);
	}
	public static void getUrL(String url) {
		driver.get(url);
	} 
	public static void navigateTo(String url1) {
		driver.navigate().to(url1);
	} 
	public static void navigateBack() {
		driver.navigate().back();
	} 
	public static void navigateRefresh() {
		driver.navigate().refresh();
	} 
	public static void defaultContent() {
		driver.switchTo().defaultContent();
		}
	public static void getTitle() {
		driver.getTitle();
		}
	public static void getCurrentUrl() {
		driver.getCurrentUrl();
		}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void sendKeys(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println("Texts are="+text);
	}
	public static void getAttribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		System.out.println(attribute);
	}
	public static Actions action() {
		Actions act = new Actions(driver);
		return act;
	}
	public static void act_ContextClick(WebElement element) {
		act.contextClick(element).build().perform();
	}
	public static void act_Click(WebElement element) {
		act.click(element).build().perform();
	}
	public static void act_moveToElement(WebElement element1) {
		act.moveToElement(element1).build().perform();
	}
	public static void act_dragAndDrop(WebElement elementFrom ,WebElement elementTo) {
		act.dragAndDrop(elementFrom, elementTo).build().perform();
	}
	public static void act_dragAndDropBy(WebElement element,int x,int y) {
		act.dragAndDropBy(element, x, y).build().perform();
	}
	public static void jsE_scrollintoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].ScrollintoView();", element);
	}
	public static void jsE_ScrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
	}
	public static void jsE_ScrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-500)");
	}
	public static void jsE_click(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	public static void robo_keyPress() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
	}
	public static void Robo_Release_Down() throws AWTException {
		Robot r = new Robot();
		r.keyRelease(KeyEvent.VK_DOWN);
	}
	public static void Win_Handles_con() {
		Set<String> a = driver.getWindowHandles();
		for (String b : a) {
			String c = driver.switchTo().window(b).getTitle();
			System.out.println(c);
		}}	
	public static void selectbyVisibleText(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		}
	public static void selectbyValue(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
		}
	public static void alert_accept() {
		driver.switchTo().alert().accept();
		}
	public static void alert_dismiss() {
		driver.switchTo().alert().dismiss();
		}
	public static void alert_sendkeys(String text) {
		driver.switchTo().alert().sendKeys(text);
		}
	public static void ScreenShot(String Path) throws IOException {
		TakesScreenshot b = (TakesScreenshot) driver;
		File start = b.getScreenshotAs(OutputType.FILE);
		File end = new File("C:\\Users\\Lenovo\\eclipse-workspace\\molecular\\Screenshot"+Path);
		FileHandler.copy(start, end);	
	}
	public static void frames(int index) {
		driver.switchTo().frame(index);
		}
	}
