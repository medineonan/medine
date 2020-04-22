package overRiding;

public class FinalKeyword {
 public static String str="hello";
 public static final String str1="bye"; // final variable= constant (UNCHANGABLE VALUE)

   static  public final String APPLICATION_URL= "http://syntaxtechs.com"; //should be "static public" type &UPPERCASE 
  
   final char GRADE='A'; //it is primitive

    public static void main(String[] args) {

        System.out.println(str);
        System.out.println(str1);
    }
    public final void  hello() {
    	System.out.println("I am a final method");
    }
}



