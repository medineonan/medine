package oops;

public class ConstructorCall01 {

	ConstructorCall01(){
		this(1);//must be the 1st line AlWAYS
		System.out.println("hi");
	}// sadece hi execute etmek icin ne yapilir

	ConstructorCall01(int x){
		this(1,2);
		System.out.println("merhaba");
	}
	ConstructorCall01(int x,int y){
		System.out.println("how are u");
	}


public static void main(String[] args) {
	ConstructorCall01 mdn=new ConstructorCall01();
	
}

}
