//Assignment 75 Find out the average of all numbers present in the array.
package string01;

public class Average {
	public static void main(String[] args) {
		int A[] = new int[5];
		A[0] = 23;
		A[1] = 36;
		A[2] = 47;
		A[3] = 51;
		A[4] = 67;
		int sum = 0;
		for(int i=0;i<A.length;i++) {
			sum = sum + A[i];
		}
		System.out.println("Sum: "+sum);
		double avg = sum/(A.length*1.0);//multiplying by 1.0 to convert it into double
		System.out.println("Average of numbers in the array: "+avg);
				
	}
}
