package java_class_assignment3;
import java.util.Scanner;
public class vowel_constant_user {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		char ch;
		int vowel;

		System.out.println("char=");
		ch=sc.next().charAt(0);
		System.out.println("char="+ch);
	
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("it is vowel");
		}
		else {
			System.out.println("it is constant");
		}
	}

}
