package java_class_assignment3;
import java.util.Scanner;
public class positive_negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double num;
		System.out.println("number=");
		num=sc.nextDouble();
		if(num<0.0) {
			System.out.println("it is a negative number");
			
		}else if(num>0.0) {
			System.out.println("it is a positive number");
		}else {
			System.out.println("is 0.");
		}
	}

}
