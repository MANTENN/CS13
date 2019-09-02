/**
 * Package prints Hello World to the console
 */
public class Lab1 {
    private static final String HELLO_STR = "Hello World";

    /**
     * prints HELLO_STR
     * @param args
     */
    public static void main(String[] args) {
        printString(HELLO_STR);
    }

    /**
     * Prints the string passed on the same line
     * @param stringToPrint
     */
    public static void printString(String stringToPrint) {
        System.out.print(stringToPrint);
    }
}
