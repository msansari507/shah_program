// Assignment 43 WAP on parameterized super calling statement.
package package002;
class Meta1{
	Meta1(String profile){
		if(profile == "Admin")
			System.out.println("User has admin level of access");
		else
			System.out.println("User is not a Admin user.");
	}
}
public class Facebook2 extends Meta1 {
	Facebook2(String login, String profile){
		super(profile); // parameterized super calling statement.
		System.out.println("User Login: " +login);
		System.out.println("User Profile: " +profile);
		System.out.println();
		
	}
	public static void main(String[] args) {
		new Facebook2("abc@gmail.com","Standard");
		new Facebook2("xyz@gmail.com","Admin");
	}

}
