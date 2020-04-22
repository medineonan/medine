package oops;

public class Test01 {
int a,b;
 Test01(int mdn,int hkn){
	 System.out.println("parameterized constructor "+mdn+" "+hkn);
 a=mdn;
 b=hkn;
 System.out.println("value of a="+mdn);
 System.out.println("value of b="+hkn);
 }


	public static void main(String[] args) {
		Test01 sena= new Test01(10,20);
	}
}

