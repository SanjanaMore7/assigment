package Lecture_java;
import java.util.*;
public class switch_case_eg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tds,salary,Month,year,Leav;
		int tdsamount,finalsalary,Monthlysalary,yearlysalary,LeavAmount,Daysalary,CutAmount;
		String Empname;
		System.out.println("Enter the Employ name...");
		Empname=sc.nextLine();
		System.out.println("Enter the Month...");
		Month=sc.nextInt();
		System.out.println("Enter the Tds...");
		tds=sc.nextInt();
		System.out.println("Enter the year...");
		year=sc.nextInt();
		System.out.println("Enter the leav ...");
		Leav=sc.nextInt();
		System.out.println("Enter the Monthly salary ...");
		Monthlysalary=sc.nextInt();
		
		
		
		
		
		switch(Month){
		case 1:
		{
			Daysalary=Monthlysalary/31;
			 LeavAmount=Daysalary*Leav;
			 tdsamount=(Monthlysalary*tds)/100;
		     yearlysalary=Monthlysalary*12;
		     CutAmount=tdsamount+LeavAmount;
		    finalsalary=Monthlysalary-CutAmount;
		    System.out.println("day salary="+Daysalary);
		    System.out.println("employ name="+Empname);
		    System.out.println("leav amount="+LeavAmount);
		    System.out.println("tds amount="+tdsamount);
		    System.out.println("yearly Salary="+yearlysalary);
		    System.out.println("cut Amount="+CutAmount);
		    System.out.println("final salary="+finalsalary);
		    System.out.println("Date : jan/"+year);
		}
		break;
		
		case 2:
			if(year%4==0) 
		{
				Daysalary=Monthlysalary/29;
		 LeavAmount=Daysalary*Leav;
		 tdsamount=(Monthlysalary*tds)/100;
	     yearlysalary=Monthlysalary*12;
	     CutAmount=tdsamount+LeavAmount;
	    finalsalary=Monthlysalary-CutAmount;
	    System.out.println("employ name="+Empname);
	    System.out.println("leav amount="+LeavAmount);
	    System.out.println("tds amount="+tdsamount);
	    System.out.println("yearly Salary="+yearlysalary);
	    System.out.println("cut Amount="+CutAmount);
	    System.out.println("final salary="+finalsalary);
	    System.out.println("Date : feb/"+year);
	    }else {
	    	Daysalary=Monthlysalary/28;
			 LeavAmount=Daysalary*Leav;
			 tdsamount=(Monthlysalary*tds)/100;
		     yearlysalary=Monthlysalary*12;
		     CutAmount=tdsamount+LeavAmount;
		    finalsalary=Monthlysalary-CutAmount;
		    System.out.println("employ name="+Empname);
		    System.out.println("leav amount="+LeavAmount);
		    System.out.println("tds amount="+tdsamount);
		    System.out.println("yearly Salary="+yearlysalary);
		    System.out.println("cut Amount="+CutAmount);
		    System.out.println("final salary="+finalsalary);
		    System.out.println("Date : feb/"+year);
	    	
	    }
			break;
		    case 3:{
		    	Daysalary=Monthlysalary/31;
			 LeavAmount=Daysalary*Leav;
			 tdsamount=(Monthlysalary*tds)/100;
		     yearlysalary=Monthlysalary*12;
		     CutAmount=tdsamount+LeavAmount;
		    finalsalary=Monthlysalary-CutAmount;
		    System.out.println("employ name="+Empname);
		    System.out.println("leav amount="+LeavAmount);
		    System.out.println("tds amount="+tdsamount);
		    System.out.println("yearly Salary="+yearlysalary);
		    System.out.println("cut Amount="+CutAmount);
		    System.out.println("final salary="+finalsalary);
		    System.out.println("Date : mar/"+year);
		}
		break;
		case 4:{
			Daysalary=Monthlysalary/30;
		 LeavAmount=Daysalary*Leav;
		 tdsamount=(Monthlysalary*tds)/100;
	     yearlysalary=Monthlysalary*12;
	     CutAmount=tdsamount+LeavAmount;
	    finalsalary=Monthlysalary-CutAmount;
	    System.out.println("employ name="+Empname);
	    System.out.println("leav amount="+LeavAmount);
	    System.out.println("tds amount="+tdsamount);
	    System.out.println("yearly Salary="+yearlysalary);
	    System.out.println("cut Amount="+CutAmount);
	    System.out.println("final salary="+finalsalary);
	    System.out.println("Date : apr/"+year);
	    }
		break;
		case 5:{
			Daysalary=Monthlysalary/31;
		 LeavAmount=Daysalary*Leav;
		 tdsamount=(Monthlysalary*tds)/100;
	     yearlysalary=Monthlysalary*12;
	     CutAmount=tdsamount+LeavAmount;
	    finalsalary=Monthlysalary-CutAmount;
	    System.out.println("employ name="+Empname);
	    System.out.println("leav amount="+LeavAmount);
	    System.out.println("tds amount="+tdsamount);
	    System.out.println("yearly Salary="+yearlysalary);
	    System.out.println("cut Amount="+CutAmount);
	    System.out.println("final salary="+finalsalary);
	    System.out.println("Date : may/"+year);
	    }
		break;
		case 6:{
			Daysalary=Monthlysalary/30;
		 LeavAmount=Daysalary*Leav;
		 tdsamount=(Monthlysalary*tds)/100;
	     yearlysalary=Monthlysalary*12;
	     CutAmount=tdsamount+LeavAmount;
	    finalsalary=Monthlysalary-CutAmount;
	    System.out.println("employ name="+Empname);
	    System.out.println("leav amount="+LeavAmount);
	    System.out.println("tds amount="+tdsamount);
	    System.out.println("yearly Salary="+yearlysalary);
	    System.out.println("cut Amount="+CutAmount);
	    System.out.println("final salary="+finalsalary);
	    System.out.println("Date : Jun/"+year);
	    }
		break;
		case 7:{
			Daysalary=Monthlysalary/31;
		 LeavAmount=Daysalary*Leav;
		 tdsamount=(Monthlysalary*tds)/100;
	     yearlysalary=Monthlysalary*12;
	     CutAmount=tdsamount+LeavAmount;
	    finalsalary=Monthlysalary-CutAmount;
	    System.out.println("employ name="+Empname);
	    System.out.println("leav amount="+LeavAmount);
	    System.out.println("tds amount="+tdsamount);
	    System.out.println("yearly Salary="+yearlysalary);
	    System.out.println("cut Amount="+CutAmount);
	    System.out.println("final salary="+finalsalary);
	    System.out.println("Date : Jul/"+year);
	    }
		break;
		case 8:{
			Daysalary=Monthlysalary/31;
			 LeavAmount=Daysalary*Leav;
			 tdsamount=(Monthlysalary*tds)/100;
		     yearlysalary=Monthlysalary*12;
		     CutAmount=tdsamount+LeavAmount;
		    finalsalary=Monthlysalary-CutAmount;
		    System.out.println("employ name="+Empname);
		    System.out.println("leav amount="+LeavAmount);
		    System.out.println("tds amount="+tdsamount);
		    System.out.println("yearly Salary="+yearlysalary);
		    System.out.println("cut Amount="+CutAmount);
		    System.out.println("final salary="+finalsalary);
		    System.out.println("Date : aug/"+year);
		}
		break;
		case 9:{
			Daysalary=Monthlysalary/30;
		 LeavAmount=Daysalary*Leav;
		 tdsamount=(Monthlysalary*tds)/100;
	     yearlysalary=Monthlysalary*12;
	     CutAmount=tdsamount+LeavAmount;
	    finalsalary=Monthlysalary-CutAmount;
	    System.out.println("employ name="+Empname);
	    System.out.println("leav amount="+LeavAmount);
	    System.out.println("tds amount="+tdsamount);
	    System.out.println("yearly Salary="+yearlysalary);
	    System.out.println("cut Amount="+CutAmount);
	    System.out.println("final salary="+finalsalary);
	    System.out.println("Date : sep/"+year);
	    }
		break;
		case 10:{
			Daysalary=Monthlysalary/31;
			 LeavAmount=Daysalary*Leav;
			 tdsamount=(Monthlysalary*tds)/100;
		     yearlysalary=Monthlysalary*12;
		     CutAmount=tdsamount+LeavAmount;
		    finalsalary=Monthlysalary-CutAmount;
		    System.out.println("employ name="+Empname);
		    System.out.println("leav amount="+LeavAmount);
		    System.out.println("tds amount="+tdsamount);
		    System.out.println("yearly Salary="+yearlysalary);
		    System.out.println("cut Amount="+CutAmount);
		    System.out.println("final salary="+finalsalary);
		    System.out.println("Date : oct/"+year);
		}
		break;
		case 11:{
			Daysalary=Monthlysalary/30;
		 LeavAmount=Daysalary*Leav;
		 tdsamount=(Monthlysalary*tds)/100;
	     yearlysalary=Monthlysalary*12;
	     CutAmount=tdsamount+LeavAmount;
	    finalsalary=Monthlysalary-CutAmount;
	    System.out.println("employ name="+Empname);
	    System.out.println("leav amount="+LeavAmount);
	    System.out.println("tds amount="+tdsamount);
	    System.out.println("yearly Salary="+yearlysalary);
	    System.out.println("cut Amount="+CutAmount);
	    System.out.println("final salary="+finalsalary);
	    System.out.println("Date : nov/"+year);
	    }
		break;
		case 12:{
			Daysalary=Monthlysalary/31;
			 LeavAmount=Daysalary*Leav;
			 tdsamount=(Monthlysalary*tds)/100;
		     yearlysalary=Monthlysalary*12;
		     CutAmount=tdsamount+LeavAmount;
		    finalsalary=Monthlysalary-CutAmount;
		    System.out.println("employ name="+Empname);
		    System.out.println("leav amount="+LeavAmount);
		    System.out.println("tds amount="+tdsamount);
		    System.out.println("yearly Salary="+yearlysalary);
		    System.out.println("cut Amount="+CutAmount);
		    System.out.println("final salary="+finalsalary);
		    System.out.println("Date : dec/"+year);
		}
		break;
		
		}		
		

	}

}
