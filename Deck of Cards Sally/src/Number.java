public class Number extends Card{


    Number(String suit, int number) {
        super(suit, number);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Card){
            if(number <= 10) return true;
        }
        return false;
    }

}
