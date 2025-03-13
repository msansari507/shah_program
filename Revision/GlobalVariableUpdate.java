// Assignment 22 WAP to update static and non static Global Variables.
package Revision;

public class GlobalVariableUpdate {
	int l = 10;
	static int b = 30;
	public static void main(String[] args) {
		b =20;
		System.out.println(b);
// 		l = 17; // this is non static so directly can not update
		GlobalVariableUpdate g = new GlobalVariableUpdate();
		g.l = 17;
		System.out.println(g.l);
	}

}
