package Lecture_java;
import  java.util.Scanner;
public class array_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size...");
	int size=sc.nextInt();
	int Data []=new int [size];
	for(int i=0;i<Data.length;i++) {
		System.out.println("Enter array value..."+(i+1));
	Data[i]=sc.nextInt();
		
	}
	for(int i=0;i<Data.length;i++) {
		System.out.println(Data[i]);
	}
	
	}
	
}
