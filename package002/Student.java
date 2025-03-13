// Assignment 39 WAP on Single Level Inheritance
package package002;

class School{ // Super Class
	static void admission(String name, int id) {
		System.out.println("Student Name: " + name);
		System.out.println("Student Id: " +id);
	}
	void write() {
		System.out.println("Student is writing.");
	}
}

public class Student extends School{ // Student is Sub Class
	static void read() {
		System.out.println("Student is reading.");
	}
    public static void main(String[] args) {
    	admission("Alan",4532);
    	read();
    	Student s = new Student();
    	s.write();
    }

}
