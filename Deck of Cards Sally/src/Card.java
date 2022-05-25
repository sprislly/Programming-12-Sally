abstract class Card {
//hash code
    String suit;
    int number;
    String name;

    public Card(){
    }

    Card(String suit, int number){
        this.suit = suit;
        this.number = number;
    }

    public String getName() {
        if (number == 1) {
            return "Ace";
        }
        if (number == 11) {
            return "Jack";
        }
        if (number == 12) {
            return "Queen";
        }
        if (number == 13) {
            return "King";
        }
        return String.valueOf(number);
    }

    @Override
    public String toString() {
        return getName() + " of " + suit;
    }
}
