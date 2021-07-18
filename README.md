Card Shuffler 

This file provides information about the Java program Card Shuffler and provides instructions on how to use program. 

The java program that associates this file, “Card Shuffler”, generates the number of decks of cards of the type specified by the user, shuffles them, prints out the name of cards and returns the list to the users. Users must choose the type of cards and the number of decks for the program to work.  

Overview of the “Card Shuffler”:
•	User can select what type of cards they want to generate and shuffle by passing in an argument on the command line.
o	This program currently supports only two type of game cards - Playing cards (P) and the Uno Cards (U) .
•	User must specify  the number of decks of cards to generate and shuffle, as an option on the command line.
o	The project restricts the deck size from 1 to 5. This is to prevent users from entering a huge number that crashes the application.
•	Based on user input, the program generates and shuffles cards.
•	Present the shuffled cards to the user on the console along with the number of cards shuffled.

Design details of “Card Shuffler”

•	Card shuffler is built using Java 8. Eclipse is used to build the code. 
•	This project creates a small java package named testcardshuffler. It contains five 5 java classes in it. 
•	GameCard - Interface
•	PlayingCards and UnoCards - Classes that implement the Gamecard interface. Builds the types of cards currently supported by the program. 
•	CardsController – Acts as the class that controls the work flow. ( Accept and validate input, build cards, shuffle and return cards)
•	CardApplication  - Runs the application.  Contains main() method to execute the program.
 
Requirements:
Need to have the Java 8 Java Runtime Environment (JRE) installed in the system to allow program to run. Install  Eclipse IDE to run, but any other java supported IDE should be good. 

Run the Project: On your IDE run CardApplication.java play the game. On in a shell terminal, please run java CardApplication and pass in Card Type and Number of Decks when requested. 

Features:            

•	Accepts and validate the user input for card type and number of decks. 
•	Gives error message if user enters invalid input. For example, number or invalid letter for the card type. It repeatedly  asks and waits until user provides a valid input.
•	Requests the number of decks of selected card to shuffle. Limited to 5 decks.
•	Prints out the name of the cards shuffled onto the console.

Known Issues:

•	When the users enter a valid choice for the card type, P or U, and follows it up with multiple characters separated by white spaces, the program, raises and prints out a number format exception as it assumes the next value would represent the input, number of inputs.

![image](https://user-images.githubusercontent.com/87593185/126056618-e038ec7e-369f-49dd-80f1-c263a1442afd.png)
