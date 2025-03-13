// Assignment 72 WAP on basic concepts of Array
package string01;
public class ArrayProgram1 {

	public static void main(String[] args) {
		try {
		int rollno[] = new int[3];
		rollno[0] = 57;
		rollno[1] = 67;
		rollno[2] = 87;
		rollno[3] = 97;//
		for(int i=0; i<=2; i++) {
			System.out.println(rollno[i]);
		 }
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Maximum of three students are allowed to enter their roll nos");
		}
		
	}

}
