package oops;

public class Calculator {
//define methods to calculate add,sub,mult,div
// istegimiz sayi olsun diye iclerine int a, int b yazdik.DIKKAT INT yazdin INT OLSUN
void add(int a,int b) {
   
	System.out.println(a+b);	
}
void sub(int a,int b) {
    
    System.out.println(a-b);
    }

void mult(int a,int b) {
   
    System.out.println(a*b);
    }
//double olarak tanimladigim icin  double num yazdim icine
void div(double a,double b) {
   
    System.out.println(a/b);
    }

public static void main(String []args) {
	
	Calculator xr=new Calculator();
      xr.add(100,50);
      xr.sub(5,5);
      xr.mult(9,9);
      xr.div(64.2,8.5);


}
}

