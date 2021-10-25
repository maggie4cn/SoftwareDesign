package sportConcussionAssProject;

import java.util.Scanner;

public class SymptomEvaluationUI {

	// get a reference to the SymptomEvaluation instance
	public static SymptomEvaluation SE = new  SymptomEvaluation();
	
	public static void main(String[] args) {
		
		Athlete ath = SE.getAthlete();
			
		Scanner scan = new Scanner(System.in);
		do{
		       displayMenu();
		       int choice = scan.nextInt();
		    switch(choice) {
		    	case 1:
		    		ath.enterSymptomsInfor();
		    		break;
		    	case 2:
		    		ath.getSymptomAndScore();
		    		break;
		    	case 3:
		    		ath.getRiskyCondition();
		    		break;
		    	case 4:
		    	System.out.println("Exciting the program... ");
		  		   System.exit(0);
		  		   break;
		  		   default:
		  		   System.out.println("Invalid Input ");

		    }    
		}while(true);
	}
	
	 static void displayMenu() {
		 System.out.println("Welcome to Sport Concussion Assessment System");
		 System.out.println("Please select one of the following options:");
		 System.out.println("1. Enter Symptoms");
		 System.out.println("2. Display Symptoms Summary");
		 System.out.println("3. Am I at Risk?");
		 System.out.println("4. Exit");
		 System.out.println("Enter your choice (1-4):");
	 }
}
