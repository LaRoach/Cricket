
import static org.junit.Assert.*;

import org.junit.Test;

public class over_test {

	match matchInn1;
	score score;
	
	@Test
	public void test() {
		matchInn1 = new match("Australia","SouthAfrica",5);
		score = new score(matchInn1);
		score.addScore(1);
		score.addScore(2);
		score.addScore(1);
		score.addScore(2);
		score.addScore(1);
		score.addScore(2);
		
		score.addScore(1);
		score.addScore(2);
		assertEquals(2, matchInn1.getCurrentOver()+1);
	}

}