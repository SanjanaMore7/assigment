package assignment04;
import java.util.*;
public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value of n:");
		int n=sc.nextInt();
		double sum=0;
		for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        
        System.out.println("Sum of the series: " + sum);
    

	}

}
