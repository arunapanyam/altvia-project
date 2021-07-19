package testcardshuffler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//class that creates multiple decks of Playing cards
public class PlayingCardsServices implements CardServices {

	enum CardShapes {
		Heart, Diamond, Spade, Clubs
	};

	enum CardNames {
		Ace, King, Queen, Jack
	}

	public List<String> buildDeckOfCards(int numberOfDecks) {

		List<String> deckOfCards = new ArrayList<String>();

		CardShapes[] shapes = CardShapes.values();

		for (int a = 1; a <= numberOfDecks; a++) {

			for (CardShapes cardShape : shapes) {

				deckOfCards.addAll(Arrays.asList(populateCardSet(cardShape.name())));
			}
		}

		return deckOfCards;
	}

	private String[] populateCardSet(String shapes) {

		String[] setOfShapes = new String[13];

		for (int i = 0; i <= setOfShapes.length - 1; i++) {
			if (i == 0) {
				setOfShapes[i] = shapes + " " + CardNames.Ace;
			} else if (i == 10) {
				setOfShapes[i] = shapes + " " + CardNames.King;
			} else if (i == 11) {
				setOfShapes[i] = shapes + " " + CardNames.Queen;
			} else if (i == 12) {
				setOfShapes[i] = shapes + " " + CardNames.Jack;
			} else
				setOfShapes[i] = shapes + " " + String.valueOf(i + 1);
		}

		return setOfShapes;
	}

}
