package salesforece_base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keywords {
	WebDriver driver;
	FileInputStream fis;
	Properties prop;

	public void open() {
		System.setProperty("webdriver.chrome.driver", "C://Seleniumfiles//chromedriver.exe");
		try {
			driver = new ChromeDriver();
			fis = new FileInputStream(
					"C:\\java\\eclipse\\project_selesforce\\src\\main\\java\\salesforece_base\\Obectrepositry");
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void url(String httpurl) {
		driver.get(httpurl);
	}

	public void inputs(String testdata, String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(testdata);
	}

	public void click(String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();

	}

	public void close() {
		driver.close();
	}

	public void select(String objectname) {
driver.findElement(By.xpath(prop.getProperty(objectname))).click();		
	}

}
