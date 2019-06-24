import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class Example {

    // Mooctest Selenium Example


    // <!> Check if selenium-standalone.jar is added to build path.

    public static void test(WebDriver driver) {
        // TODO Test script
        // eg:driver.get("https://www.baidu.com/")
        // eg:driver.findElement(By.id("wd"));
    	try {
        	driver.get("https://www.nowcoder.com/");
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/ul[1]/li[2]/a")).click();
			Thread.sleep(500);
			//测试筛选按钮的时候，浏览器要最大化，不然“筛选”按钮会被挡住
	    	driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[2]/div/a[3]")).click();
	    	//driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div[2]/div/a[3]")).click();
			//Thread.sleep(3000);
	    	driver.findElement(By.linkText("重选")).click();
	    	//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[1]/a")).click();
			Thread.sleep(500);
	    	driver.findElement(By.linkText("Java工程师")).click();
	    	driver.findElement(By.linkText("C++工程师")).click();
	    	driver.findElement(By.linkText("2019")).click();
	    	driver.findElement(By.linkText("最热")).click();
	    	driver.findElements(By.cssSelector("body > div.nk-container > div.nk-main.papers-center.with-banner-page.clearfix > div:nth-child(2) > div.module-body > ul > li:nth-child(1) > a > div.content-item-brief > div.web-logoimg > img")).get(0).click();
	    	
	    	//进入试卷详情页
	    	String currentWindow = driver.getWindowHandle();
        	Set<String> handles = driver.getWindowHandles();//获取所有窗口句柄
        	Iterator<String> it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//切换到新窗口
        	}
        	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/a/span")).click();
        	Thread.sleep(10000);//进行登录操作
        	driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
        	
        	//进入做题页面
        	handles = driver.getWindowHandles();//获取所有窗口句柄
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//切换到新窗口
        	}
        	driver.findElement(By.xpath("//*[@id=\"runCode\"]")).click();
        	//driver.findElement(By.xpath("//*[@id=\"jsCpn_9_popup_0\"]/div[2]/a")).click();
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[3]/div[4]/span[1]/a")).click();
        	/*
        	driver.findElement(By.xpath("//*[@id=\"jsCpn_23_component_2\"]/div[1]/div")).click();
        	driver.findElement(By.xpath("//*[@id=\"jsCpn_23_component_2\"]/div[1]/div")).clear();
        	driver.findElement(By.xpath("//*[@id=\"jsCpn_23_component_2\"]/div[1]/div")).sendKeys("测试");
        	driver.findElement(By.linkText("确定")).click();
        	*/
        	Thread.sleep(5000);
        	driver.findElement(By.linkText("标记一下")).click();
        	driver.findElement(By.xpath("//*[@id=\"next\"]")).click();
        	
        	//下一题
        	handles = driver.getWindowHandles();//获取所有窗口句柄
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//切换到新窗口
        	}
        	driver.findElement(By.xpath("//*[@id=\"aheadFinish\"]")).click();
        	/*
        	driver.findElement(By.xpath("//*[@id=\"jsCpn_9_popup_0\"]/div[2]/a[1]")).click();
        	*/
        	Thread.sleep(1000);
        	
        	//结果页面
        	handles = driver.getWindowHandles();//获取所有窗口句柄
        	it = handles.iterator();
        	while(it.hasNext()) {
    			driver.switchTo().window(it.next());//切换到新窗口
        	}
        	Thread.sleep(2000);
        	driver.findElement(By.linkText("答案解析")).click();
        	driver.findElement(By.cssSelector("#commentList > div:nth-child(1) > div.answer-content.clearfix > div.answer-legend > a")).click();
        	Thread.sleep(3000);
        	driver.findElement(By.xpath("//*[@id=\"jsCpn_26_component_0\"]/div[2]/div[2]/div/textarea")).clear();
        	driver.findElement(By.xpath("//*[@id=\"jsCpn_26_component_0\"]/div[2]/div[2]/div/textarea")).sendKeys("我的观点");
        	driver.findElement(By.xpath("//*[@id=\"jsCpn_26_component_0\"]/div[2]/div[2]/a")).click();
        	
        	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }

    public static void main(String[] args) {
        // Run main function to test your script.
        WebDriver driver = new ChromeDriver();
        try { test(driver); } 
        catch(Exception e) { e.printStackTrace(); }
        finally { 
        	//driver.quit();
        }
    }

}
