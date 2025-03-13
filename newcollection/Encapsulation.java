// Assignment 119 WAP on Encapsulation
package newcollection;
class EncapsProgram{
	private String email_id = "abc@gmail.com";
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	private int age = 47;
}

public class Encapsulation {

	public static void main(String[] args) {
		EncapsProgram e = new EncapsProgram();
		e.setEmail_id("xyz@yahoo.com");
		System.out.println("Email_id: "+e.getEmail_id());
		e.setAge(54);
		System.out.println("Age: "+e.getAge());

	}

}
