
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java study aid.");
        Quiz create = new Quiz(10);
        int length = create.l;
        System.out.println("The quiz will have " + length + " questions.");
        System.out.println("Press enter to reveal the answers.");

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
        Question eleven = new Question("What is 5+6?", "11");
        Question twelve = new Question("What is 6+6?", "12");
        Question thirteen = new Question("What is 6+7?", "13");
        Question fourteen = new Question("What is 7+7?", "14");
        Question fifteen = new Question("What is 7+8?", "15");
        Question sixteen = new Question("What is 8+8?", "16");
        Question seventeen = new Question("What is 8+9?", "17");
        Question eighteen = new Question("What is 9+9?", "18");
        Question nineteen = new Question("What is 9+10?", "19");
        Question twenty = new Question("What is 10+10?", "20");

        System.out.print(create.generateQ()+ "\n");

        System.out.print("\nComplete!");

    }


}

