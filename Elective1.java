package GSLC2;

public class Elective1 implements Elective {
	private String elec1;
	private int scoreReq;
	private int avScore;
	
	public Elective1 (int avScore, String elec1, int scoreReq)
	{
		setAvScore(avScore);
		setElec1(elec1);
		setScoreReq (scoreReq);
	}
	
	public void requirement() {
		if(getAvScore() < getScoreReq())
		{
			System.out.println("Student is not eligible.\n");
		}
		else
		{
			System.out.println("Student is eligible.\n");
		}
	}
	
	public String toString()
	{
		return "Name of Course: " + elec1 + ", Score Needed to Enter: " + scoreReq + ", Student's Average Score " + avScore;
	}
	
	
	public String getElec1() {
		return elec1;
	}
	public void setElec1(String elec1) {
		this.elec1 = elec1;
	}
	public int getScoreReq() {
		return scoreReq;
	}
	public void setScoreReq(int scoreReq) {
		this.scoreReq = scoreReq;
	}

	public int getAvScore() {
		return avScore;
	}

	public void setAvScore(int avScore) {
		this.avScore = avScore;
	}
}
