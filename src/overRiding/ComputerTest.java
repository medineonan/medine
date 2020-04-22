package overRiding;

public class ComputerTest {

	public static void main(String[] args) {

		Computer[] computers={new Apple("APPLE"),new Lenovo("LENOVO"),new Hp("HP"),new Dell ("DELL")};

  for(Computer c:computers) {
	   c.start();
	   c.display();
	   System.out.println("------------");
   }
  
  for(int i=0; i<computers.length; i++) {
	  computers[i].start();
	  computers[i].display();
	  }
  
  
	}

}
