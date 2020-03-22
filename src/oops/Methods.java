package oops;

public class Methods {
//create a method that will say welcome 10 times
void sayWelcome() {
	 
	for(int i=0;i<4;i++) {
		System.out.println("Welcome");
		}
}
//asagida yazarken siraya DIKKAT word,int diye tanimladin
void sayAnything(String word,int times) {
	for (int i=1;i<=times;i++) {
		System.out.println(word);
	}
	}


public static void main(String[]args) {
	Methods m=new Methods();
	m.sayWelcome();
    m.sayAnything("merhaba",6 );
    m.sayAnything("Stay safe", 3);





}
}

