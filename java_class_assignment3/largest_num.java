package java_class_assignment3;

public class largest_num {

	public static void main(String[] args) {
		int num1,num2,num3;
		num1=100;
		num2=500;
		num3=25;
		
		
		if(num1>num2 && num1>num3) {
			System.out.println("number1 is largest");
			
		}else {
			if(num2>num1 && num2>num3) {
				System.out.println("number2 is largest");
			}else {
				System.out.println("number3 is largest");
			}
		}
	}

}
