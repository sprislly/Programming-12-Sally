import java.util.Comparator;
public class CustomComparator implements Comparator<Card>{
    @Override
    public int compare(Card o1, Card o2) {
        if (o1.suit.ordinal() > o2.suit.ordinal()) {
            return 1;
        }
        if (o1.suit.ordinal() < o2.suit.ordinal()) {
            return -1;
        }
        if (o1.suit.ordinal() == o2.suit.ordinal()) {
            if (o2.num == 1) {
                return 1;
            }
            if (o1.num < o2.num) {
                return 1;
            }
            if (o1.num > o2.num) {
                return -1;
            }
        }
        return 0;
    }


}
