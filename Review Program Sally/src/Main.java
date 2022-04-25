import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Welcome to the Java study aid.");

        Quiz create = new Quiz(20);
        int quizLength;
        quizLength = create.generateQuiz();
        System.out.println("The quiz will have " + quizLength + " questions.");
        System.out.println("Press enter to reveal the answers.\n");

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

        ArrayList<String> q = new ArrayList<>();
        ArrayList<String> a = new ArrayList<>();

        q.add(one.q);
        a.add(one.a);
        q.add(two.q);
        a.add(two.a);
        q.add(three.q);
        a.add(three.a);
        q.add(four.q);
        a.add(four.a);
        q.add(five.q);
        a.add(five.a);
        q.add(six.q);
        a.add(six.a);
        q.add(seven.q);
        a.add(seven.a);
        q.add(eight.q);
        a.add(eight.a);
        q.add(nine.q);
        a.add(nine.a);
        q.add(ten.q);
        a.add(ten.a);
        q.add(eleven.q);
        a.add(eleven.a);
        q.add(twelve.q);
        a.add(twelve.a);
        q.add(thirteen.q);
        a.add(thirteen.a);
        q.add(fourteen.q);
        a.add(fourteen.a);
        q.add(fifteen.q);
        a.add(fifteen.a);
        q.add(sixteen.q);
        a.add(sixteen.a);
        q.add(seventeen.q);
        a.add(seventeen.a);
        q.add(eighteen.q);
        a.add(eighteen.a);
        q.add(nineteen.q);
        a.add(nineteen.a);
        q.add(twenty.q);
        a.add(twenty.a);

        for (int i = 1; i <= quizLength; i++) {
            int num = create.generateQ();
            System.out.println("Question " + i + ": " + q.get(num));
            enter.nextLine();
            System.out.println("The answer is " + a.get(num) + ".\n");

        }

        System.out.print("Complete!");

    }
}

