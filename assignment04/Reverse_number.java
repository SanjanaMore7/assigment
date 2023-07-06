package assignment04;
import java.util.*;
public class Reverse_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number=sc.nextInt();
		int ReverseNumber=0;
		while(number!=0) {
			int digit = number % 10;
			ReverseNumber=ReverseNumber*10+digit;
			number/=10;
		}
		
System.out.println("ReverseNumber:-"+ReverseNumber);
	}

}
