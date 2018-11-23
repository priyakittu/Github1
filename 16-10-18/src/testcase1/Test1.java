package testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 
{
public static void main(String[] args) 
		{
			System.setProperty("webdriver.chrome.driver","F:/64bitAutomationSW/chromedriver.exe");
			ChromeDriver ff=new ChromeDriver();
			ff.get("file:///F:/qsp.html");
			ff.findElement(By.id("un")).sendKeys("krishna");
			ff.findElement(By.name("pwd")).sendKeys("krishna");
			ff.findElement(By.className("login")).click();
			ff.findElement(By.linkText("youtube.com")).click();
			ff.navigate().back();
			ff.navigate().forward();
			ff.navigate().refresh();

}
}
