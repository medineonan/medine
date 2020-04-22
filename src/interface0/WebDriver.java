package interface0;

public interface WebDriver {
   void openBrowser();
   
   void closeBrowser();
   
   void maximizeWindow();
   
   void findElement();
}
class ChromeDriver implements WebDriver{
	@Override
	public void openBrowser() {
		System.out.println("open the chrome browser");
	}
	@Override
	public void closeBrowser() {
		System.out.println("close the chrome browser");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("maximaiz the window");
	}
	@Override
	public void findElement() {
		System.out.println("find the elements");
	}
}
class FirefoxDriver implements WebDriver{
	@Override
	public void openBrowser() {
		System.out.println("open firfox driver");
	}
	@Override
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	@Override
	public void maximizeWindow() {
		System.out.println("maximaize the window");
	}
	@Override
	public void findElement() {
		System.out.println("find the elements");
	}
}