
import static org.junit.Assert.*;

import org.junit.Test;

public class ball_test {

	match match1;
	score score;
	
	@Test
	public void test() {
		match1 = new match("Australia","SouthAfrica",5);
		score = new score(match1);
		score.addScore(1);
		score.addScore(2);
		assertEquals(2, score.getScoreInOverInBall(1, 2));
	}

}