// Assignment 48 WAP to avoid method overriding using final method
package package002;

class User{
	void authenticate(){ // method declared as final
		System.out.println("Authentication is Successful.");
	}
}
class AdminUser extends User{
	void authenticate() {
		System.out.println("Admin User is trying to authenticate..");
		super.authenticate(); // calling parent class method
	}
}

public class UserAuthentication {
public static void main(String[] args) {
	AdminUser a = new AdminUser();
	a.authenticate();
	
}
}
