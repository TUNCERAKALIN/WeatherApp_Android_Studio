
public class ValidDeckTest1 {
	public static void main(String[] args) {
		Card c1 = null;
		Deck d1 = new Deck();
		d1.shuffle();
		boolean testpass = true;
		
		for (int i=0; i<100; ++i) {
			c1 = d1.draw();
			if(i<52 && c1==null)
				testpass = false;
			if(i>=52 && c1!=null)
				testpass = false;
				
		}
		if(testpass)
			System.out.println("Passed");	
	}	
}
