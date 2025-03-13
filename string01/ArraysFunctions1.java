// Assignment 80 WAP on Arrays functions using Arrays.sort and Arrays.toString 
package string01;
import java.util.Arrays;
import java.util.Scanner;
public class ArraysFunctions1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter total no of students");
		String Student[] = new String[s.nextInt()];
		System.out.println("Enter names of " +Student.length+" Students");
		for(int i =0;i<Student.length;i++) {
			Student[i] = s.next();
		}
		s.close();
		System.out.println("Names of students are:- "+Arrays.toString(Student));
		Arrays.sort(Student);
		System.out.println("Student Names after sorting:- "+Arrays.toString(Student));
	}
}
