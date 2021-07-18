package testcardshuffler;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class CardController {

	private int numberOfDecks;
	private String cardType;
	private List<String> resultList = new ArrayList<String>();
	private GameCard cardManager;
	Scanner in = new Scanner(System.in);

	// Request user to enter type of card 

	public String getUserInputCardType() {

		System.out.println("Welcome to Card shuffler >>>");
		System.out.println("Please choose the type of cards (P: Playing cards," + " U: Uno) >>>> ");

		cardType = in.next();
		// Validates the input
		if (!cardType.equalsIgnoreCase("P") && !cardType.equalsIgnoreCase("U")) {
			do {
				System.out.println("Invalid data Enter (P: Playing cards, U: Uno) ");
				cardType = in.next();
			} while (!cardType.equalsIgnoreCase("P") && !cardType.equalsIgnoreCase("U"));
		}
		// return the user selected type of card
		return cardType;
	}
	
	// Request user to enter the number of decks to shuffle 
	public int getUserInputDeckSize() {
		System.out.println("Select the deck size. (1-5) >>>>>> ");
		
		// Validates the input
		try {
			numberOfDecks = Integer.parseInt(in.next());
		} catch (NumberFormatException e) {
			System.out.println("Your Input is not a number: " + e.getMessage());
		}
		// Validates the input
		if (numberOfDecks < 1 || numberOfDecks > 5) {
			do {
				System.out.println("Invalid data: Please provie deck size (1-5)");
				try {
					numberOfDecks = Integer.parseInt(in.next());
				} catch (NumberFormatException e) {
					System.out.println("Your Input is not a number: " + e.getMessage());
				}
			} while (numberOfDecks < 1 || numberOfDecks > 5);
		}
		in.close();
		return numberOfDecks;
	}

	// build the required deck of cards by calling the 
	// method from the respective classes.
	public List<String> buildCards() {
		if (cardType.equalsIgnoreCase("p")) {
			cardManager = new PlayingCards();
			resultList = cardManager.buildDeckOfCards(numberOfDecks);
		} else if (cardType.equalsIgnoreCase("u")) {
			cardManager = new UnoCards();
			resultList = cardManager.buildDeckOfCards(numberOfDecks);
		}
		return resultList;
	}

	// shuffle the cards and show the result in the console
	public List<String> shuffleCards(String cardName, int deckSize, List<String> cardsToShuffle) {
		String name;
		if (cardName.equalsIgnoreCase("p")) {
			name = "Playing Cards";
		} else
			name = "Uno Cards";

		System.out.println("Shuffled cards from " + deckSize + " decks of " + name);
		System.out.println("================================================");

		Collections.shuffle(cardsToShuffle);
		System.out.println(cardsToShuffle);
		return cardsToShuffle;
	}
}
