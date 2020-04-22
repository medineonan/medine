package abstractClass;

public class PhoneTest {

	public static void main(String[] args) {
	
        Phone sg=new Samsung();
        sg.takePicture();
        sg.playMusic();
        sg.text();
        sg.call();
        
      System.out.println("*************");
        Phone ip=new Iphone();
        ip.takePicture();
        ip.playMusic();
        ip.call();
        ip.text();
	}

}
