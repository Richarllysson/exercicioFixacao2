package entities;

public class Grade {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;
    
    public static final double CRITERIA = 60;
    
    public double getFinalGrade(){
        return firstGrade + secondGrade + thirdGrade;
    } public boolean isApproved(){
        return getFinalGrade() > CRITERIA;
    } public double needToApprove() {
	     	if (isApproved()) {
	         		return 0;
		}
		return CRITERIA - getFinalGrade();
	}
}