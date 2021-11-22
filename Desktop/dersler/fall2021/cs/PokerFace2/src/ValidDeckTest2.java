import java.util.List;

public class ValidDeckTest2 {
	public static void main(String[] args) {
		Card c1 = null;
		Deck d1 = new Deck();
		d1.shuffle();
		boolean testpass = true;
		
		List<Card> l1 = d1.draw(100);
		
		if (l1.size() != 52)
			testpass = false;
		
		if(testpass)
			System.out.println("Passed");
	}	
}
