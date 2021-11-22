import java.util.ArrayList;
import java.util.List;

public class PairHandStatisticsTest2 {
	
	static final int TEST_SIZE = 10000;
	static final int PAIR_FRAC = 3;
	
	
	public static void main(String[] args) {
		List<Deck> decks = new ArrayList<Deck>();
		int paircount = 0;
		
		for (int i=0; i<TEST_SIZE; ++i) {
			Deck d1 = new Deck();
			d1.shuffle();
			decks.add(d1);
		}
		
		for (int i=0; i<TEST_SIZE; ++i) {
			decks.get(i).draw();			//Burned
			Card c1 = decks.get(i).draw();	//Player1
			decks.get(i).draw();			//Player2
			decks.get(i).draw();			//Player3
			decks.get(i).draw();			//Player4
			decks.get(i).draw();			//Player5
			Card c2 = decks.get(i).draw();	//Player1
			if (checkPair(c1,c2))
				paircount++;			
		}
		System.out.println(paircount);	
		
		double errMargin = TEST_SIZE/10.00; 											// 10% variance allowed as error margin
		double defaultProbability = (int) (0.0588 * (1.0-(1.0/PAIR_FRAC)) * TEST_SIZE);  // about 5.88% pair probability without rigging
		double lowerBound = TEST_SIZE/PAIR_FRAC + defaultProbability - errMargin;
		double upperBound = TEST_SIZE/PAIR_FRAC + defaultProbability + errMargin;
		
		System.out.println(lowerBound);	
		System.out.println(upperBound);	
		
		if (paircount>lowerBound && paircount<upperBound)
			System.out.println("Passed");		
	}
	
	public static boolean checkPair(Card c1, Card c2) {		
		if(c1.getRank().equals(c2.getRank()))
			return true;		
		return false;
		
	}
}
