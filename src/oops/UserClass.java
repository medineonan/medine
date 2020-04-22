package oops;


public class UserClass {
/*Write program: userClass  that has a constructor that initializes instance variable name and mobile number. 
Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.
*/
	public static void main(String[] args) {
		userInfo mdn=new userInfo("medine",1235 ,"12 book rd");
		mdn.userDetails();
	}
	
String name;
int mobileNumber;

  UserClass(String name, int mobileNumber){
	  
	this.mobileNumber =mobileNumber;
	this.name=name;
}
}
class userInfo extends UserClass {
	String address;
	
	userInfo (String name, int mobileNumber, String address){
	 super(name,mobileNumber);
	 this.address=address;	
	}
	
	void userDetails() {
		System.out.println(name+ " "+mobileNumber+" "+address);
	}
}


	

