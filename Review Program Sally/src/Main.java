
public class Main {
    public static void main(String[] args) {
        //main text
        System.out.println("Welcome to the Java study aid.");

        //question and answer input
        Question one = new Question("What is 0+1?", "1");
        Question two = new Question("What is 1+1?", "2");
        Question three = new Question("What is 1+2?", "3");
        Question four = new Question("What is 2+2?", "4");
        Question five = new Question("What is 2+3?", "5");
        Question six = new Question("What is 3+3?", "6");
        Question seven = new Question("What is 3+4?", "7");
        Question eight = new Question("What is 4+4?", "8");
        Question nine = new Question("What is 4+5?", "9");
        Question ten = new Question("What is 5+5?", "10");


        //end
        System.out.print("\nComplete!");

    }

}