package Lecture_java;
import java.util.*;
public class array_string3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name size...");
		String Size=sc.nextLine();
		String Data[]=new String[4];
	    for(int i=0;i<Data.length;i++) {
		System.out.println("Enter the name value..."+i);	
		Data[i]= sc.nextLine();
		}
	    for(int i=0;i<Data.length;i++) {
	    	System.out.println(Data[i]);
	    }
	}

}
