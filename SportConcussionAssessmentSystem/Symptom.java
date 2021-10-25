package sportConcussionAssProject;

public class Symptom {
	private int numberOfSymptoms;
	private int severityScore;
	
	// default constructor
	public Symptom() {
		this.numberOfSymptoms = 0;
		this.severityScore = 0;
	}
	
	// other constructor
	public Symptom(int num, int score) {
		this.numberOfSymptoms = num;
		this.severityScore = score;
	}
	
    public int getSymptomsNumber() {
    	return numberOfSymptoms;
    }
    
    public int getSymptomScore() {
    	return severityScore;
    }
 
}
