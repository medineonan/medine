package oops;

public class ConstructorCall {

 public ConstructorCall() {
	System.out.println("non argument constructor");
}

 public ConstructorCall (String str) {
	this();
}
 public ConstructorCall(String str, String str1) {
	this(str); //this("str","str") calismaz
}

public static void main(String[] args) {
	ConstructorCall mdn=new ConstructorCall ("Java", "Love");

}
}
