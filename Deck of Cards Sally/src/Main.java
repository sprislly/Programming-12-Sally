import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Make a deck of cards.");

        Number c1 = new Number("Clover", 1);
        Number c2 = new Number("Clover", 2);
        Number c3 = new Number("Clover", 3);
        FaceCard cJ = new FaceCard("Clover", 11);
        FaceCard cQ = new FaceCard("Clover", 12);
        FaceCard cK = new FaceCard("Clover", 13);

        LinkedList<Card> deck = new LinkedList<>();
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("How many cards would you like in your hand?");
        int hand = in.nextInt();
        in.nextLine();

        /*
        For(int i = 0; i < hand; i++){

            System.out.println();
        }
        */

        /*
        instantiate a deck of cards
        abstract class of cards
        enum suit
        int value > face card class > num card class
        is it face card?  instance of face card
        linked list of card class
        instantiate with for loop up to 14, or write it all out
        */

    }

}
