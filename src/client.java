public class client {

	public static void main(String[] args) {
		match matchInn1 = new match("Australia","SouthAfrica",8);
		score score = new score(matchInn1);
		
		score.addScore(4);
		score.addScore(0);
		score.addScore(0);
		score.addScore(4);
		score.addScore(6);
		score.addScore(1);

		score.addScore(3);
		score.addScore(2);
		score.addScore(0);
		score.addScore(0);
		score.addScore(6);
		score.addScore(4);
		
		score.addScore(6);

		
		debugger.Log("Current Over : "+ ( matchInn1.getCurrentOver()+1 ));
		debugger.Log("Current Ball : "+matchInn1.getCurrentOverBall());
		debugger.Log("Current Over Score "+score.getScorePerOver(matchInn1.getCurrentOver()));
		debugger.Log("Total Score : "+score.getCurrentScore());
	}

}