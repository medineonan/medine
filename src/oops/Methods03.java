package oops;

public class Methods03 {
	void num(int a) {
		if(a%2==0) {
			System.out.println(a+ " an even number");
		}else {
			System.out.println(a+ " is an odd number");
		}
	}
	public static void main(String[] args) {
		Methods03 m= new Methods03();
		m.num(7);
	    m.num(10);
	}
}

