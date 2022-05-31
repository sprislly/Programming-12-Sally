public class FaceCard extends Card{

    FaceCard(int type, int num) {
        super(type, num);
        if (num == 11) {
            face = Face.JACK;
        }
        if (num == 12) {
            face = Face.QUEEN;
        }
        if (num == 13) {
            face = Face.KING;
        }
        if (type == 1) {
            suit = Suit.SPADES;
        }
        if (type == 2) {
            suit = Suit.HEARTS;
        }
        if (type == 3) {
            suit = Suit.CLUBS;
        }
        if (type == 4) {
            suit = Suit.DIAMONDS;
        }

    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Card){
            return num >= 11;
        }
        return false;
    }
}
