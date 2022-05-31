import java.util.Comparator;
public class CustomComparator implements Comparator<Card>{
    @Override
    public int compare(Card o1, Card o2) {
        if (o1.type > o2.type) {
            return 1;
        }
        if (o1.type < o2.type) {
            return -1;
        }
        return 0;
    }


}
