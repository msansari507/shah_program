// Assignment 85 WAP to find out the current date, past date and future date using String functions.
package string01;
import java.util.Date;
public class DateChecker {
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1.getTime());// output will be in epoch time 
		System.out.println(d1);// human understandable form Tue Feb 25 11:20:52 IST 2025
		String format1 = d1.toString();
		String month = format1.substring(4, 7);
		System.out.println(month);
		String date = format1.substring(8,10);
		System.out.println(date);
		String Year = format1.substring(format1.length()-4);
		System.out.println(Year);
		String current_date = date.concat("-").concat(month).concat("-").concat(Year);
		System.out.println("Current Date: "+current_date); //DD-MMM-YYYY
		
		Date d2 = new Date(d1.getTime()+(1000*60*60*24*2));// add two Future days 
		String format2 = d2.toString();
		month = format2.substring(4, 7);
		System.out.println(month);
		date = format2.substring(8,10);
		System.out.println(date);
		Year = format2.substring(format1.length()-4);
		System.out.println(Year);
		String future_date = date.concat("-").concat(month).concat("-").concat(Year);
		System.out.println("Future Date: "+future_date); //DD-MMM-YYYY
		
		Date d3 = new Date(d1.getTime()-(1000*60*60*24*2));// subtract two Past days 
		String format3 = d3.toString();
		month = format3.substring(4, 7);
		System.out.println(month);
		date = format3.substring(8,10);
		System.out.println(date);
		Year = format3.substring(format1.length()-4);
		System.out.println(Year);
		String past_date = date.concat("-").concat(month).concat("-").concat(Year);
		System.out.println("Past Date: "+past_date); //DD-MMM-YYYY
		
	}

}
