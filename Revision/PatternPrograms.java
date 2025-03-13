package Revision;

public class PatternPrograms {
	static int i;
	static int j;
	static int k;
	void pattern1() {
		System.out.println("----Pattern1-----");
		for(i =1 ; i<=3 ; i++) {
			for(j=1; j<=i; j++) {
			System.out.print("* ");
			}
			System.out.println();
		}
	}
	void pattern2(){
		System.out.println("----Pattern2-----");
		int str = 3;
		for(i=1; i<=3; i++){
			for(j=1;j<=str;j++) {
				System.out.print("* ");
			}
			System.out.println();
			str--;
		}
	}
	void pattern3() {
		System.out.println("----Pattern3-----");
		int spc = 2;
		int str = 1;
		for(i=1;i<=3;i++) {
			for(j=1;j<=spc;j++) {
				System.out.print("- ");
			}
			for(k=1;k<=str;k++)
			System.out.print("* ");
			spc--;
			str++;
			System.out.println();
		}
	}
		
public static void main(String[] args) {
	PatternPrograms p = new PatternPrograms();
	p.pattern1();
	p.pattern2();
	p.pattern3();
}
}
