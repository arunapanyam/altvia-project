package testcardshuffler;

import java.util.List;

public class CardApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CardController cardcontroller = new CardController();

		String cardType = cardcontroller.getUserInputCardType();
		int numberOfDecks = cardcontroller.getUserInputDeckSize();
		List<String> deckOfCards = cardcontroller.buildCards();

		List <String> shuffledCards = cardcontroller.shuffleCards(cardType, numberOfDecks, deckOfCards);
		System.out.println("Number of shuffled cards are: " + shuffledCards.size());
		
	}
}
