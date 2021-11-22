import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ShuffleTest {

	static final int TEST_SIZE = 100;
	
	public static void main(String[] args) {
		List<Deck> decks = new ArrayList<Deck>();
		boolean testpass = true;
		
		for (int i=0; i<TEST_SIZE; ++i) {
			Deck d1 = new Deck();
			d1.shuffle();
			decks.add(d1);
		}
		
		for (int i=0; i<TEST_SIZE; ++i) {
			for (int j=0; j<TEST_SIZE; ++j) {
				String d1Str = decks.get(i).toString();
				String d2Str = decks.get(j).toString();
				
				if(i!=j && d1Str.equals(d2Str))
					testpass = false;
			}
		}
		
		if(testpass)
			System.out.println("Passed");
	}

}