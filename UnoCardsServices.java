
package testcardshuffler;

import java.util.ArrayList;
import java.util.List;

//class that  creates the multiple decks of Unocards
public class UnoCardsServices implements CardServices {

	enum cardColors {
		Red, Blue, Green, Yellow, Black
	};

	enum cardNames {
		Skip, Reverse, Wild, DrawTwo, DrawFour, Blank
	};

	public List<String> buildDeckOfCards(int howManyDecks) {

		List<String> deckOfCards = new ArrayList<String>();

		cardColors[] colors = cardColors.values();

		for (int a = 1; a <= howManyDecks; a++) {

			for (cardColors cardColor : colors) {

				deckOfCards.addAll(populateCardSet(cardColor.name()));
			}
		}

		return deckOfCards;
	}

	private List<String> populateCardSet(String color) {

		List<String> setOfUnoCards = new ArrayList<String>();

		if (color.equals("Black")) {
			setOfUnoCards.addAll(populateBlackCardsSet(color));
		} else {
			setOfUnoCards.addAll(populateColorCardsSet(color));
		}

		return setOfUnoCards;
	}

	private List<String> populateBlackCardsSet(String color) {
		List<String> setOfBlackCards = new ArrayList<String>();
		int numberOfBlackCardsInDeck = 12;

		for (int i = 0; i <= numberOfBlackCardsInDeck - 1; i++) {
			if (i <= 3) {
				setOfBlackCards.add("" + cardNames.DrawFour);
			} else if (i >= 4 && i <= 7) {
				setOfBlackCards.add("" + cardNames.Wild);
			} else {
				setOfBlackCards.add("" + cardNames.Blank);
			}
		}
		return setOfBlackCards;
	}

	private List<String> populateColorCardsSet(String color) {
		List<String> setOfColorCards = new ArrayList<String>();
		int numberOfColorCardsInDeck = 13;

		int j = 0;

		do {
			for (int i = 0; i <= numberOfColorCardsInDeck - 1; i++) {
				if (i == 0 || i <= 9) {
					setOfColorCards.add(color + " " + i);
				} else if (i == 10) {
					setOfColorCards.add(color + " " + cardNames.DrawTwo);
				} else if (i == 11) {
					setOfColorCards.add(color + " " + cardNames.Reverse);
				} else if (i == 12) {
					setOfColorCards.add(color + " " + cardNames.Skip);
				}
			}
			j++;
		} while (j == 1);
		return setOfColorCards;
	}

}
