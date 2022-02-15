package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double myValue = 20.00d;
        double myValue2 = 80.00d;
        double myTotalValue = (myValue + myValue2) * 100.00d;
        System.out.println(myTotalValue);
        double isRemainder = myTotalValue % 40.00;
        System.out.println(isRemainder);
        boolean noRemainder = (isRemainder == 0) ? true : false;
        System.out.println(noRemainder);
        if (!noRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
