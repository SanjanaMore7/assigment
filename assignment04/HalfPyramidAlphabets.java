package assignment04;
import java.util.*;
public class HalfPyramidAlphabets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Rows:");
		int rows=sc.nextInt();
		int alphabet=65;
		for(int i=1; i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.println((char)alphabet+" ");
			}
			alphabet++;
            System.out.println();
		}

	}

}
