abstract class Card implements Comparable<Card>{
//hash code
    int type;
    int num;
    Face face;
    Suit suit;


    Card(int type, int num){
        this.type = type;
        this.num = num;
    }

    public String getName() {
        if (num == 1) {
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
        return String.valueOf(num);
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
    public int compareTo(Card o) {
        if (o.suit == Suit.SPADES) {
            return 2;
        }
        if (o.suit == Suit.HEARTS) {
            return 1;
        }
        if (o.suit == Suit.CLUBS) {
            return 0;
        }
        if (o.suit == Suit.DIAMONDS) {
            return -1;
        }
        return -2;
    }

    @Override
    public String toString() {
        return getName() + " of " + getSuit();
    }
}
