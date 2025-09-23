import java.util.Scanner;
import java.util.Arrays;

public class DeckOfCards {

    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            return null; 
        }

        String[][] playersHands = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        for (int c = 0; c < cardsPerPlayer; c++) {
            for (int p = 0; p < numPlayers; p++) {
                playersHands[p][c] = deck[cardIndex++];
            }
        }
        return playersHands;
    }

    public static void printHands(String[][] playersHands) {
        if (playersHands == null) {
            System.out.println("Error: Not enough cards in the deck to distribute.");
            return;
        }

        System.out.println("\n--- Distributed Cards ---");
        for (int i = 0; i < playersHands.length; i++) {
            System.out.println("Player " + (i + 1) + "'s Hand: " + Arrays.toString(playersHands[i]));
        }
    }

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        String[] deck = initializeDeck(suits, ranks);
        deck = shuffleDeck(deck);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter the number of cards to distribute to each player: ");
        int cardsPerPlayer = scanner.nextInt();

        String[][] hands = distributeCards(deck, numPlayers, cardsPerPlayer);
        printHands(hands);
        
        scanner.close();
    }
}