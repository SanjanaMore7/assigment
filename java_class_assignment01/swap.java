package java_class_assignment01;
import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,swap;
	System.out.println("a=");
	a=sc.nextInt();
	System.out.println("b=");
	b=sc.nextInt();
	swap=a;
	a=b;
	b=swap;
	
	System.out.println("swap");
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	
	
	}

}
