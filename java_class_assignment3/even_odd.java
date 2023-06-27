package java_class_assignment3;
import java.util.Scanner;
public class even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("enter the number");
		num=sc.nextInt();
		if (num%2==0)
		{
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
	}

}
