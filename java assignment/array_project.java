package Lecture_java;
import java.util.*;
public class array_project {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	System.out.println("enter the size of value");
	int size=sc.nextInt();
	String Data[]=new String[size];
	int data []=new int [size];
	for(int i=0;i<Data.length;i++) {
		System.out.println("Enter array value..."+(i+1));
	Data[i]=sc.next();
	data[i]=sc.nextInt();
	}
	for(int i=0;i<Data.length;i++) {
		System.out.println(Data[i]+data[i]);
		
	}
	for(int i=0;i<data.length;i++) 
	{
	
	
		}
	
	}

}
