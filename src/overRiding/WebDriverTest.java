package overRiding;

public class WebDriverTest {

	public static void main(String[] args) {
		WebDriver driver= new InternetExplorer();
		driver.open();
		
        
		 WebDriver drv= new WebDriver();
	     drv.open();
	
	     WebDriver fr=new FireFoxDriver();
	      fr.open();
	
	      WebDriver ch=new ChromeDriver();
	      ch.open();
	//upcasting var burada parent class refer ederek child i cagiriyotuz
	
	}
}
