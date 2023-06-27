package Lecture_java;
import  java.util.Scanner;
public class array_char3 {

	public static void main(String[] args) {
		char Data[]=new char[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size...");
	int size=sc.nextInt();
	for(int i=0;i<Data.length;i++) {
		System.out.println("Enter array value..."+(i+1));
	Data[i]=sc.next().charAt(0);
		
	}
	for(int i=0;i<Data.length;i++) {
		System.out.println(Data[i]);
	}
		}
		
	}


