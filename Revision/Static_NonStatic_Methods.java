package Revision;

public class Static_NonStatic_Methods {
	static void read() {
		System.out.println("She is reading a novel");
	}
	void write() {
		System.out.println("Alan is writing a test script");
	}
 public static void main(String[] args) {
	read();
	Static_NonStatic_Methods n = new Static_NonStatic_Methods();
	n.write();
}
}
