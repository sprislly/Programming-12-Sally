public class Main {
    static int sum;

    /*
        Fibonacci Solution.
        @param n number in sequence; requires n > 0;
        @return the solution of the fibonacci sequence
    */

    public static void sum(int sequence) {
        if (sequence > 0) {
            sum += sequence;
        }
    }

    /*
        Fibonacci Sequence.
        @param n number spot in sequence; requires n > 0;
        @returns the number in the fibonacci sequence for the specified number spot
    */

    public static int fibonacci(int n) {
        if (n == 0) {
            return n;
        }

        if (n == 1 || n == 2) {
            sum(n);
            return 1;
        }
        sum(1);
        return fibonacci(n - 2) + fibonacci(n - 1);
    }

    public static void main (String[]args){
        fibonacci(5);
        System.out.print(sum);
    }
}
