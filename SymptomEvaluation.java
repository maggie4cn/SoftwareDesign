package sportConcussionAssProject;

import java.util.LinkedList;
import java.util.Scanner;

public class SymptomEvaluation {
	static Scanner scan = new Scanner(System.in);
			static LinkedList<Symptom> symptomList = new LinkedList<Symptom>();
			
			   
			public Athlete getAthlete() {
				Athlete a = new Athlete();
				return a;
			}
			
			public static void enterSymptoms() {	
				String[] symptoms = {"headache","pressure in head","neck pain","nausea or vomitting",
					       "dizziness","blurred vision","balance problems","sensitivity to light",
					       "sensitivity to noise","feeling slowed down","feeling like \"in a fog\"",
					       "\"Don't feel right\"","difficulty concentrating","difficulty remembering",
					       "fatigue or low energy","confusion","drowsiness","trouble falling asleep",
					       "more emotional","irritability","sadness","nervous or anxious"};
				int score = 0;
				int symptomsCount = 0;
				for(int i = 0; i < symptoms.length;) {
					System.out.println("Please enter your "+ symptoms[i]   
							+ "score  (none (0), mild (1-2), moderate (3-4), & severe (5-6)):");
					int tempScore = scan.nextInt();
					if(tempScore > 0 && tempScore <=6) {
						score += tempScore;
						symptomsCount++;
						i++;
					}
					else if(tempScore == 0) {
						i++;
					}
					else if(tempScore < 0 ||tempScore > 6)
						System.out.println("Invalid input.");
				}
				
				//add new symptom game case
				Symptom sym = new Symptom(symptomsCount,score);
				symptomList.add(sym);		
			}
				
			public static void getSymptomAndScore(){
				
				int symptomsNum = symptomList.getLast().getSymptomsNumber();
				int score = symptomList.getLast().getSymptomScore();
				SymptomSummary.displaySymptomAndScore(symptomsNum,score);
			}
			
			public static void getRiskyCondition() {
				int i = symptomList.size();
				if(i > 1) {
					int score = symptomList.get(i-1).getSymptomScore();
					int difference = symptomList.get(i-1).getSymptomsNumber()- 
							symptomList.get(i-2).getSymptomsNumber();
					SymptomSummary.displayRiskyCondition(difference,score);		
				}
				else {
					System.out.println("No overall rating of risky condition if there is no previous game.");
				}
				
			}
			
}
