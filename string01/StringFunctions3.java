package string01;// Assignment 84 WAP on string functions using replace, replaceAll, substring,matches,repeat.
public class StringFunctions3 {
	public static void main(String[] args) {
		String s1= "I love cats"; 
		String s2 = s1.replace("cats", "dogs"); //replace cats with dogs
		System.out.println(s1);
		System.out.println(s2);
		s1 = "A banana";
		System.out.println(s1.replace('a', 'o')); // replace letter 'a' with 'o'
		System.out.println("-----------------------------");
		String s3 = "Hello Yu! This is Hello World Programme";
		String s4 = s3.replaceAll("[a,e,i,o,u]", "*"); //replace all vowels with '*'
		System.out.println(s3);
		System.out.println(s4);
		String order = "Order ID: 98765"; //replace order digits with XXXX
		System.out.println(order.replaceAll("[0-9]", "X"));
		System.out.println("-----------------------------");
		String email = "shah@gmail.com";// "user@example.com", extract the domain "example.com" using substring()
		String domain = email.substring(5, 14);
		System.out.println("Email:"+email);
		System.out.println("Domain:"+domain);
		String path = "/home/user/document.txt";//from path "/home/user/document.txt", extract "document.txt" using substring()
		String file_name = path.substring(11);
		System.out.println("Path:"+path);
		System.out.println("File:"+file_name);
		System.out.println("-----------------------------");
/* Verify if a password contains at least one uppercase letter, one lowercase letter,one digit,and one special character and if length greater equal to character then only its Strong password.*/
		String pwd = "fga%5j41L";
		boolean b1 = pwd.matches("(.)*[A-Z](.)*");
		boolean b2 = pwd.matches("(.)*[a-z](.)*");
		boolean b3 = pwd.matches("(.)*[0-9](.)*");
		boolean b4 = pwd.matches(".*[^a-zA-Z0-9 ].*");//Matches any character that is NOT a letter, digit, or space is special character
		if(pwd.length()>=8 &&b1 && b2 && b3 && b4)
			System.out.println("Strong Password");
		else
			System.out.println("Weak Password");
		System.out.println("-----------------------------");
		String s = "I love Testing";
		System.out.println(s.repeat(2));
	}
}
