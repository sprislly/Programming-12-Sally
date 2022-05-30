abstract class Card {
//hash code
    int type;
    int number;
    Face face;
    Suit suit;

    public Card(){
    }


    Card(int type, int number){
        this.type = type;
        this.number = number;
    }

    public String getName() {
        if (number == 1) {
            return "Ace";
        }
        if (face == Face.JACK) {
            return "Jack";
        }
        if (face == Face.QUEEN) {
            return "Queen";
        }
        if (face == Face.KING) {
            return "King";
        }
        return String.valueOf(number);
    }
    public String getSuit() {
        if (suit == Suit.CLUBS) {
            return "Clubs";
        }
        if (suit == Suit.SPADES) {
            return "Spades";
        }
        if (suit == Suit.HEARTS) {
            return "Hearts";
        }
        if (suit == Suit.DIAMONDS) {
            return "Diamonds";
        }
        return "";
    }


    @Override
    public String toString() {
        return getName() + " of " + getSuit();
    }
}
