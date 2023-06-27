package java_class_assignment3;
import java.util.Scanner;
public class largest_num_user {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("enter number1");
		num1=sc.nextInt();
		System.out.println("enter number2");
		num2=sc.nextInt();
		System.out.println("enter number3");
		num3=sc.nextInt();
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("number1 is largest");
			
		}else {
			if(num2>num1 && num2>num3) {
				System.out.println("number2 is largest");
			}else {
				System.out.println("number3 is largest");
			}
		}
	}

}
