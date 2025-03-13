// Math Class present in java.lang package.
package Revision;
public class MathClass {
	public static void main(String[] ars) {
		System.out.println("Addition of numbers");
		System.out.println((Math.addExact(20, 30)));
		System.out.println((Math.addExact(1233389, 9199)));
		System.out.println("Difference of numbers");
		System.out.println(Math.subtractExact(10, 5));
		System.out.println(Math.subtractExact(145678, 20165));
		System.out.println("Maximum no. between two numbers");
		System.out.println((Math.max(450, 449)));
		System.out.println(Math.max(34535.8, 67378.9869));
		System.out.println(Math.max(76.5, 76.4));
		System.out.println(Math.max(245673890900l, 3538383993030l));
		System.out.println("Minimum no. between two numbers");
		System.out.println((Math.min(450, 449)));
		System.out.println(Math.min(34535.8, 67378.9869));
		System.out.println(Math.min(76.5, 76.4));
		System.out.println(Math.min(245673890900l, 3538383993030l));
		System.out.println("change negative no into positive");
		System.out.println(Math.abs(-76.5566789990000));
		System.out.println(Math.abs(-8765));
		
		System.out.println("Generate random double values from 0.0 to 1.0");
		for(int i =1; i<=5; i++)
		System.out.println(Math.random());
		
		System.out.println("Use of global variables");
		double pi_value = Math.PI;
		System.out.println("value of Pi is: "+pi_value);
		double exponential = Math.E;
		System.out.println("value of e is: "+exponential);
		double tau = Math.TAU;
		System.out.println("value of Tau is: " +tau);
	}

}
