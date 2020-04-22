package abstractClass;

//have to make abstract class .. abstract is a non access modifier.
public abstract class Phone{
	
	//implemented methods
	public void call() {
		System.out.println("Phone can make a call.");
	}
	public void text() {
		System.out.println("Phone can send a text.");
	}
	//unimplemented methods=undefined=abstract methods
	
	public abstract void takePicture();
	
	public abstract void playMusic();
}

class Iphone extends Phone{
	// public modifier
	public void takePicture() {
		System.out.println("Iphone takes pictures.");
	}
	public void playMusic() {
		System.out.println("Iphone provides music from AppStore.");
	}
}
class Samsung extends Phone{
	
	public void takePicture() {
		System.out.println("Samsung takes pictures.");
	}
	public void playMusic() {
		System.out.println("Samsung provides music from google store.");
	}
}
  
