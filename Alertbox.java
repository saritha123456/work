package alerthandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		//using findelement and click we find alert address and clicked it
		driver.findElement(By.name("B1")).click();
		Thread.sleep(2000);
		//System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().sendKeys("HI");
		//Thread.sleep(2000);
		driver.switchTo().alert().accept();

	}

}
