import java.util.Random;

public class Quiz {
    int l;
    int n;

    Quiz (int l){
        Random rand = new Random();
        this.l = rand.nextInt(l) + 1;
    }
    public int generateQ(){
        Random rand = new Random();
        return rand.nextInt(l) + 1;

    }
}

// pulls x number of rand q
