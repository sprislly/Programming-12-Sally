import java.util.*;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Create a deck of cards.");
        LinkedList<Card> deck = new LinkedList<>();

        for (int i = 0; i < 13; i++) {
            if (i < 10) {
                deck.add(new Number(1, i + 1));
                deck.add(new Number(2, i + 1));
                deck.add(new Number(3, i + 1));
                deck.add(new Number(4, i + 1));

            }else{
                deck.add(new FaceCard(1, i + 1));
                deck.add(new FaceCard(2, i + 1));
                deck.add(new FaceCard(3, i + 1));
                deck.add(new FaceCard(4, i + 1));
            }
        }

        int numCards = 0;
        CustomComparator c = new CustomComparator();
        Collections.sort(deck,c);
        Iterator<Card> rankedDeck = deck.iterator();
        while (rankedDeck.hasNext()) {
            System.out.println(rankedDeck.next());
            numCards++;
        }

        System.out.println("There are "+ numCards + " cards in the deck.");

        Collections.shuffle(deck);
        Scanner in = new Scanner(System.in);
        System.out.println("\nDraw a hand.\nHow many cards would you like in your hand?");
        int amt = in.nextInt();
        in.nextLine();

        System.out.println("\nYou have " + amt + " cards in your hand.");
        Iterator<Card> newHand = deck.iterator();
        for (int i = 0; i < amt; i++) {
            System.out.println(newHand.next());
        }




    }

}
