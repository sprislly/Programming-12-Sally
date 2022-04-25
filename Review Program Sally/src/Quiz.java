import java.util.Random;

public class Quiz {
    int l;

    Quiz (int l){
        this.l = l;
    }
    public int generateQuiz(){
        Random rand = new Random();
        return rand.nextInt(l) + 1;
    }


    public int generateQ(){
        Random rand = new Random();
        return rand.nextInt(l);

    }
}

