package java_class_assignment2;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class age_calculator {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your birth year:");
		int birthyear=input.nextInt();
		System.out.println("Enter your birth moth:");
		int birthMoth=input.nextInt();
		System.out.println("Enter your birth day:");
		int birthDays=input.nextInt();
		
		LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthyear, birthMoth, birthDays);
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");    
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.parse("1/1/1960", formatter);
        Period age = Period.between(birthDate, currentDate);
        int years = age.getYears();
        int months = age.getMonths();
        int days = age.getDays();
        
        
        
        int totalMonths = years * 12 + months;
        int totalWeeks = (int) birthDate.until(currentDate).toTotalMonths() / 4;
        
        
        System.out.println("Age:");
        System.out.println(years+"years"+months+"months"+days+"days");
        
        
		

	}

}
