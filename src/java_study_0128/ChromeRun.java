package java_study_0128;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeRun {

	public static void main(String[] args) {

		//크롬 드라이버의 위치를 프로퍼티에 추가 
		System.setProperty("webdriver.shrome.driver", "/.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naver.com");
		System.out.println(driver.getPageSource());
	
	}

}
