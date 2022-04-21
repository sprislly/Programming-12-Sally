import java.util.Random;

public class Quiz {
    int l;

    Quiz (int l){
        Random rand = new Random();
        this.l = rand.nextInt(l) + 1;
    }

}

// pulls x number of rand q