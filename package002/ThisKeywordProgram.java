// Assignment 46 WAP on this keyword.
// this.global_variable = local_variable
package package002;

public class ThisKeywordProgram {
  String name;
  int age;
  boolean Voting_Right;
  void citizen_details(String name, int age) {
	  System.out.println("Citizen name: "+name);
	  System.out.println("Age: " +age);
	  if(age>=18) {
		  boolean v_right = true;
		  this.Voting_Right = v_right; // assigning local var value to global var
	  }
	  else {
		  boolean v_right = false;
		  this.Voting_Right = v_right;
	  }
  }
  public static void main(String[] args) {
	  ThisKeywordProgram t = new ThisKeywordProgram();
	  t.citizen_details("Alan", 16);
	  if(t.Voting_Right)
		  System.out.println("You are eligible for voting");
	  else
		  System.out.println("You are not eligible for voting");
  }
}
