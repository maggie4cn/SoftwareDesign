package sportConcussionAssProject;

public class SymptomSummary {
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_RED = "\u001B[31m";
	
	public static void displaySymptomAndScore(int symptomsNum, int score) {
		System.out.println("Results:");
		System.out.println("Total number of symptoms: " + symptomsNum);
		System.out.println("Symptom severity score: " + score);
		System.out.println();
	}
	
	public static void displayRiskyCondition(int difference,int score) {
		System.out.println();
		System.out.print("Overall rating: ");
		if(difference < 3 && score < 10) {
			System.out.println(ANSI_GREEN + "No difference" + ANSI_RESET);
		}
		else if(difference < 3 && score >= 10) {
			System.out.println(ANSI_YELLOW + "Unsure" + ANSI_RESET);
		}
		else if(difference >= 3 && score >= 15) {
			System.out.println(ANSI_RED + "Very different" + ANSI_RESET);
		}
		 System.out.println();
	}
	
}
