package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int myVariable = 50;    // the whole line is a statement, so type + expression in this case
        myVariable++;   // statement
        myVariable--;   // statement
        System.out.println("This is a test"); // statement

        System.out.println("This is" +
                    " another" +    // statement too, we have semicolon in the end
                    " still more.");

        // multiple statements, but this is not recommended, can be confusing
        int anotherVariable = 50; myVariable--;System.out.println("This is another one");
    }
}
