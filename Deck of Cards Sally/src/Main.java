import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Make a deck of cards.");
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

        System.out.println(deck);


        Scanner in = new Scanner(System.in);
        System.out.println("How many cards would you like in your hand?");
        int hand = in.nextInt();
        in.nextLine();

        /*
        For(int i = 0; i < hand; i++){

            System.out.println();
        }
        */



    }

}
