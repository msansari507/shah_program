// Assignment 21 WAP for static & non static global variables 
// and utilize them in both static and non static methods.
package Revision;

public class GlobalVariable {
 double pi = 3.14; // non static global variable
 static double r = 5; // static global variable
 static int l = 12; // static global variable
 int b = 13; // non static global variable
 
 void area_circle() { // non static method
	 GlobalVariable g = new GlobalVariable();
		double area = g.pi* r *r;
		System.out.println(area);
 }
 static void area_rectangle() { // static method
	 GlobalVariable h = new GlobalVariable();
	 int area = l * h.b;
		System.out.println(area);
	 
 }
 public static void main(String[] args) {
	 GlobalVariable n = new GlobalVariable();
	 n.area_circle();
	 area_rectangle();
}
}
