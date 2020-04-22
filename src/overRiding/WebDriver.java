package overRiding;

public class WebDriver {

	public void open() {
		System.out.println("opening browser");
	}
}

class FireFoxDriver extends WebDriver{
	
	public void open() {
		System.out.println("opening  firefox browser");
	}
}
class ChromeDriver extends WebDriver{
	
	public void open() {
		System.out.println("opening  chrome browser");
	}
}

class InternetExplorer extends WebDriver{
	public void open() {
		System.out.println("opening  IE browser");
	}
	
}