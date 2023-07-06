package assignment04;
import java.util.*;
public class Even_odd_integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Set of Integer(0 to Stop):");
		int evenSum = 0;
        int oddSum = 0;
        int number=sc.nextInt();
        
while(number!=0) {
	if(number % 2 == 0) {
		evenSum += number;
	}else {
		oddSum += number;
	}
}
System.out.println("Sum of even integers: " + evenSum);
System.out.println("Sum of odd integers: " + oddSum);
	}

}
