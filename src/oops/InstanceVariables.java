package oops;

public class InstanceVariables {

String name="Medine"; //instance variable

public static void main(String[]args) {
	String name="Hakan";
	System.out.println(name);
	
	InstanceVariables object=new InstanceVariables();
	System.out.println(object.name);

object.name="Orhan";
System.out.println(name);
System.out.println(object.name);
// Change value of local variable
name="Sena";
System.out.println(name);


}
}
