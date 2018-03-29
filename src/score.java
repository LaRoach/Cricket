public class score {
	
	private match match;
	private int totalscore=0;

	public score(match m) {
		match = m;
	}

	public void addScore(int score) {
		totalscore += match.addScore(score);
	}
	
	public int getCurrentScore(){
		return totalscore;
	}
	
	public int getScorePerOver(int over){
		over o = match.getOverAt(over);
		int s = 0;
		for(int i=0; i<o.getCurrentBall();i++){
			s += o.getScoreAtBall(i);
		}
		return s;
	}
	
	public int getTotalScore(){
		return totalscore;
	}
	


public void ShowScoreBoard() {
	debugger.Log(" -- " + match.getTeam1() + " VS " + match.getTeam2() + " -- ");
	debugger.Log("Batting : " + match.getTeam1());
	debugger.Log("Current Score : " + totalscore);
	debugger.Log("Current Over : " + (match.getCurrentOver() + 1));
	ShowScorePerOver();
	debugger.Log("Current Over Ball : " + (match.getCurrentOverBall()));
	debugger.Log("Total Score : " + totalscore);
}

public void ShowScorePerOver() {
	int s=0;
	for (int i = 0; i < match.getCurrentOver(); i++) {
		if(match.getOverAt(i).getCurrentBall() > 0){
			debugger.Log("Over "+(i+1)+" : ");
			s=0;
			for (int j = 0; j < match.getOverAt(i).getCurrentBall(); j++) {
				s+=match.getOverAt(i).getScoreAtBall(j);
				debugger.Log(" "+match.getOverAt(i).getScoreAtBall(j));
			}
			debugger.Log(" = "+s);
		}
	}
}

public int getScoreInOverInBall(int over,int ball){
	over-=1;
	ball-=1;
	debugger.Log(match.getOverAt(over).getScoreAtBall(ball)+"");
	return match.getOverAt(over).getScoreAtBall(ball);
}

}
