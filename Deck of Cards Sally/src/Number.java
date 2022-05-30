public class Number extends Card{


    Number(int type, int num) {
        super(type, num);
        if (type == 1) {
            suit = Suit.SPADES;
        }
        if (type == 2) {
            suit = Suit.CLUBS;
        }
        if (type == 3) {
            suit = Suit.HEARTS;
        }
        if (type == 4) {
            suit = Suit.DIAMONDS;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Card){
            if(number <= 10) return true;
        }
        return false;
    }

}
