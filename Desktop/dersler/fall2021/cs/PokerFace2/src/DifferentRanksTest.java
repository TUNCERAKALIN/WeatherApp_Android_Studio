import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DifferentRanksTest {

	static final int TEST_SIZE = 10000;

	public static void main(String[] args) {

		List<Deck> decks = new ArrayList<Deck>();
		int randomrankcount1 = 0;
		int randomrankcount2 = 0;
		int randomrankcount3 = 0;

		Rank rank1 = Rank.getRandomRank();
		Rank rank2 = Rank.getRandomRank();
		Rank rank3 = Rank.getRandomRank();

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
			if (checkPair(c1,c2)) {
				if(c1.getRank().equals(rank1))
					randomrankcount1++;	
				if(c1.getRank().equals(rank2))
					randomrankcount2++;	
				if(c1.getRank().equals(rank3))
					randomrankcount3++;	
			}
		}
		System.out.println(randomrankcount1);	
		System.out.println(randomrankcount2);	
		System.out.println(randomrankcount3);	

		if (randomrankcount1<((TEST_SIZE*1.0/12.0)+(TEST_SIZE*5.0/120.0))*0.3725 && 
				randomrankcount1>((TEST_SIZE*1.0/12.0)-(TEST_SIZE*5.0/120.0))*0.3725 && 
				randomrankcount2<((TEST_SIZE*1.0/12.0)+(TEST_SIZE*5.0/120.0))*0.3725 && 
				randomrankcount2>((TEST_SIZE*1.0/12.0)-(TEST_SIZE*5.0/120.0))*0.3725 && 
				randomrankcount3<((TEST_SIZE*1.0/12.0)+(TEST_SIZE*5.0/120.0))*0.3725 && 
				randomrankcount3>((TEST_SIZE*1.0/12.0)-(TEST_SIZE*5.0/120.0))*0.3725)
			System.out.println("Passed");		
	}

	public static boolean checkPair(Card c1, Card c2) {		
		if(c1.getRank().equals(c2.getRank()))
			return true;		
		return false;

	}
}
