public class FaceCard extends Card{

    FaceCard(String suit, int number) {
        super(suit, number);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Card){
            if(number >= 11) return true;
        }
        return false;
    }
}
