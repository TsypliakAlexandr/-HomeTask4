package Test;

import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

public class Suit {
	public static void main(String[] args) throws Exception {
		HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
		driver.get("https://google.ru");
		System.out.println("Title is : "+ driver.getTitle());
		WebClient webClient = (WebClient) get(driver, "webClient");
		driver.quit();
	}
	private static Object get(Object object, String field) throws Exception {
		  Field f = object.getClass().getDeclaredField(field);
		  f.setAccessible(true);
		  return f.get(object);
		 }
}
