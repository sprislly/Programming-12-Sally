abstract class Card {
//hash code
    String suit;
    int number;

    public Card(){
    }

    Card(String suit, int number){
        this.suit = suit;
        this.number = number;
    }



    @Override
    public String toString() {
        return number + " of " + suit;
    }
}
