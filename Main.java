package www.bridgelabz.Deckofcard;

public class Main {
	
	public static void main(String[] args) {
		
		players play = new players();
		play.numOfPlayer();
		
		CardSequence seq = new CardSequence();
		seq.playerCardSequence();
		
		DeckOfCards object = new DeckOfCards();
		object.displaycards();
		

		
	
	}

}
