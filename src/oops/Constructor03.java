package oops;

public class Constructor03 {
	
  public Constructor03() {
    	System.out.println("public constructor");
    }

    Constructor03(int num){
    	System.out.println("default constructor");
    }
    protected Constructor03(int num, int num1) {
	System.out.println("protected constructor "+num+" "+num1);
}
    private Constructor03(String str) {
	   System.out.println("private sonstructor "+ str);
   }
public static void main(String[] args) {
	Constructor03 mdn=new Constructor03();
	Constructor03 mdn1=new Constructor03(12);		
	Constructor03 mdn2=new Constructor03(12,13);
	Constructor03 mdn3=new Constructor03("hello");

}

}
