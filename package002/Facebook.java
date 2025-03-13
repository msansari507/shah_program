// Assignment42 
//WAP on super calling statement using non parameterized super calling statement
package package002;
class MetaBusiness{
	MetaBusiness(){
		System.out.println("User has access of Meta business account.");
	}
}
public class Facebook extends MetaBusiness {
	Facebook(){ 
		super(); // using super() calling statement explicitly
		System.out.println("User has access only for Facebook account.");
	}
public static void main(String[] args) {
	new Facebook();
	}
}