
import static org.junit.Assert.*;

import org.junit.Test;

public class score_test{

	match matchInn1;
	score score;
	
	@Test
	public void test() {
		matchInn1 = new match("Australia","SouthAfrica",5);
		score = new score(matchInn1);
		score.addScore(1);
		score.addScore(2);
		assertEquals(3, score.getCurrentScore());
	}

}