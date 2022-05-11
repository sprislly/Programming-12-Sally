import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public String character;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("test.txt"));
        /*
        Find Unique Words.
        @param requires String.
        @return the unique words in order.
        */
        LinkedHashSet<String> unique = new LinkedHashSet<>();
        while(scanner.hasNext()) {
            /*
            [^a-zA-Z0-9] specifies all characters except numbers and letter.
                For example, - , . and ; are all replaced.
             */
            unique.add(scanner.next().replaceAll("[^a-zA-Z0-9]", ""));

        }

        int counter = 0;
        for (String s : unique) {
            System.out.println(s);
            counter ++;
        }

        System.out.println("\nThere are " + counter + " unique words in the Iliad.");
    }

    /*
    Only Add Unique Strings.
    @param requires String.
    @return true or false depending on if the String is already in the Set.
    */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof String temp){
            return Objects.equals(this.character, temp);
        }
        return false;
    }


}
