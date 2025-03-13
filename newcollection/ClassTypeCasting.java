// Assignment 116 WAP on Class Typecasting to achieve Upcasting(in implicit& explicit way) 
//and Downcasting
package newcollection;

public class ClassTypeCasting {

	public static void main(String[] args) {
		Object o1 = new ClassTypeCasting(); // implicit Upcasting
		System.out.println("o1: "+o1);
		System.out.println(o1.hashCode());
		Object o2 = (Object) new ClassTypeCasting();// explicit Upcasting
		System.out.println("o2: "+o2);
		System.out.println("are o1 and o2 equal: "+o2.equals(o1));
		
		ClassTypeCasting c1 = (ClassTypeCasting)o1;
		System.out.println(c1.hashCode());
	}

}
