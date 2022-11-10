//package FaceElement;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class FaceElement {
//	static WebDriver qa;
//	JavascriptExecutor jsExe;
//
//	public void LaunchBrowser() {
//
//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir") + "/src/test/resources/DriverExcutable/chromedriver.exe");
//
//		qa = new ChromeDriver();
//		qa.navigate().to("https://facebook.com/");
//		qa.manage().window().maximize();
//	}
//	
////	public void ClickElementWidget() throws InterruptedException  {
////		By elementsWidget = By.xpath("//div[@class='card-body']/*[text()='Elements']");
////
////		jsExe = (JavascriptExecutor) qa;
////		jsExe.executeScript("window.scrollBy(0,250)");
////
////	  qa.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
////		qa.findElement(elementsWidget).click();
////		//Thread.sleep(2000);
//	}

