package assignment04;
import java.util.*;
public class Count_number_digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer");
		int number=sc.nextInt();
		int count=0;
		while(number!=0) {
			number/=10;
			count++;
		}
System.out.println("Enter the number:"+count);
	}

}
