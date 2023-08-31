package serialization;

import java.io.IOException;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;

public class Redirectory {
    public static void main(String[] args) {
        try (PrintStream printStream = new PrintStream("output.txt")) {
            System.setOut(printStream);
            System.out.println("life indeed a tips of spoon");
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }






    }
}