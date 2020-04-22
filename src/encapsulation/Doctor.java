package encapsulation;

public class Doctor {
// if it is private you can not access from other class
	private long licenseID;
	private long phoneNumber;
	private String email;
	
	
//access modifier should be public	
public void  setEmail(String email)	{
	if(!email.isEmpty()) {
		if(email.contains("gmail")) {
	          this.email=email;
		}else {
			System.out.println("The email should be Gmail type");
		}
	}else {
		System.out.println("Email can not be empty");
	}
}

   public String getEmail() {
	return email;
}
}
