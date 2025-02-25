package com.yogeshjava.learning;

public class CoachingTeam {
	String headCoach;
	String battingCoach;
	String bowlingCoach;
	String fieldingCoach;

	public CoachingTeam() {
		
	}
	
	public CoachingTeam(String v1, String v2, String v3, String v4) {
		headCoach = v1;
		battingCoach = v2;
		bowlingCoach = v3;
		fieldingCoach = v4;		
	}

	public String getHeadCoach() {
		return headCoach;
	}

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}

	public String getBattingCoach() {
		return battingCoach;
	}

	public void setBattingCoach(String battingCoach) {
		this.battingCoach = battingCoach;
	}

	public String getBowlingCoach() {
		return bowlingCoach;
	}

	public void setBowlingCoach(String bowlingCoach) {
		this.bowlingCoach = bowlingCoach;
	}

	public String getFieldingCoach() {
		return fieldingCoach;
	}

	public void setFieldingCoach(String fieldingCoach) {
		this.fieldingCoach = fieldingCoach;
	}
	
}
