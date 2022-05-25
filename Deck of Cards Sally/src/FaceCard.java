public class FaceCard extends Card{

    FaceCard(String suit, int number) {
        this.suit = suit;
        this.number = number;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Card){
            return number >= 11;
        }
        return false;
    }
}
