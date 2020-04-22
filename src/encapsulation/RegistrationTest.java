package encapsulation;

public class RegistrationTest {

	public static void main(String[] args) {
		Registrartion rg=new Registrartion();
		rg.setEmail("orhan@yahoo.com");
		System.out.println(	rg.getemail());
		rg.setPassword("orhan3425");
		System.out.println(rg.getPassword());
		rg.setUserName("senass45");
		System.out.println(rg.getUserName());
	}

}
