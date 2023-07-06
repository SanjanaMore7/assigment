package assignment04;

public class Reverse_Digits {

	public static void main(String[] args) {
		int number=12345;
		System.out.println("Enter the number:"+number);
		int ReverseNumber=0;
		while(number!=0) {
			int digit = number % 10;
			ReverseNumber=ReverseNumber*10+digit;
			number/=10;
		}
		System.out.println("ReverseNumber:"+ReverseNumber);
	}

}
