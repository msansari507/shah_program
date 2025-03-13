package newcollection;
public class TypeCasting {
	public static void main(String[] args) {
		//Assignment 107 WAP to convert int into double using both implicitly and explicitly
		int a = 10;
		double b = a; // implicitly
		System.out.println("a in int type: "+a);
		System.out.println("a after type casting: "+b);
		int c = 1000;
		double d = (double)c; // explicitly
		System.out.println("c in int type: "+c);
		System.out.println("c after type casting: " +d);
		// Assignment 108 WAP to convert double into int
		double p = 3.14;
		int i = (int)p; 
		System.out.println("p before type casting: "+p);
		System.out.println("p after type casting into int: "+i);
		// Assignment 109 WAP to convert double into float
		double q = 3.142857142857;
		float g = (float)q;
		System.out.println("q in double form: "+q);
		System.out.println("g in float form: "+g);
		//Assignment 110 WAP to convert byte into int
		byte n = 127;
		System.out.println("n in byte form: "+n);
		int m = (int)n;
		System.out.println("m in int form: "+m);
		// Assignment 111 WAP to convert int into byte.
		int j = 12345;
		byte o = (byte)j;
		System.out.println("j in int form: "+j);
		System.out.println("o in byte form: "+o);
		// Assignment 112 WAP to convert int into byte where int value is 10000
		int k = 10000;
		byte z = (byte)k;
		System.out.println("k in int form: "+k);
		System.out.println("z in byte form: "+z);

	}

}
