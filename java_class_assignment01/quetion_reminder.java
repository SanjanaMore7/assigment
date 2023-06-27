package java_class_assignment01;
import java.util.Scanner;
public class quetion_reminder {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int dividend,divisor;
	System.out.println("divident=");
	dividend=sc.nextInt();
	System.out.println("divisor=");
	divisor=sc.nextInt();
	int quetient=dividend/divisor;
	int remainder=dividend%divisor;
	System.out.println("quetient="+quetient);
	System.out.println("remainder="+remainder);
	}

}
