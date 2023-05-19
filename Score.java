package GSLC2;

public class Score extends Student{
	
	private int scoreOOP;
	private int scoreSE;
	private int scoreML;

	public Score(String name, String id, String department, int scoreOOP, int scoreSE, int scoreML) {
		super(name, id, department);
		setScoreOOP(scoreOOP);
		setScoreSE(scoreSE);
		setScoreML(scoreML);
	}

	public int averageScore()
	{
		return (scoreOOP + scoreSE + scoreML) / 3;
	}
	
	public int getScoreOOP() {
		return scoreOOP;
	}

	public void setScoreOOP(int scoreOOP) {
		this.scoreOOP = scoreOOP;
	}

	public int getScoreSE() {
		return scoreSE;
	}

	public void setScoreSE(int scoreSE) {
		this.scoreSE = scoreSE;
	}

	public int getScoreML() {
		return scoreML;
	}

	public void setScoreML(int scoreML) {
		this.scoreML = scoreML;
	}
}
