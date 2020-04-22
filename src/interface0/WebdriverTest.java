package interface0;

public class WebdriverTest {

	public static void main(String[] args) {
		
		 ChromeDriver chrome=new ChromeDriver();
		 chrome.openBrowser();
		 chrome.closeBrowser();
		 chrome.maximizeWindow();
		 chrome.findElement();
		 
    System.out.println("***********");
    
    FirefoxDriver fx=new FirefoxDriver();
	 fx.openBrowser();
	 fx.closeBrowser();
	 fx.maximizeWindow();
	 fx.findElement();
     
	}

}
