package encapsulation;

public class Registrartion {
	private String userName;
	private String password;
	private String email;
	
public void setUserName(String userName) {
	
	 if(!userName.isEmpty()&& userName.length()>6) {
	     this.userName=userName;
	 }else {
		 System.out.println("username can't be empty & it should be more than 6 characters");
	 }
	}
//(!password.contains(userName)) ekledim olmadi hocada da olmadi
public void setPassword(String password) {
	if(!password.isEmpty()&& password.length()>6 ) {
	     this.password=password;
	 }else {
System.out.println("password can't be empty,it should be more than 6 characters");
	}
}

public void setEmail(String email) {
	if(email.contains("yahoo")) {
        this.email=email;
	}else {
		System.out.println("The email should be Yahoo type");
	}
	}

public String getUserName() {
	return userName;
}

public String getPassword() {
	return password;
}

public String getemail() {
	return email;
}



}
