package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        double myDouble = 20.00d;    // 1
        double mySecondDouble = 80.00d;  // 2
        double myTotalDouble = (myDouble + mySecondDouble) * 100.00d;   // 3
        System.out.println(myTotalDouble);
        double moduloMyTotalDouble = myTotalDouble % 40.00; // 4
        System.out.println(moduloMyTotalDouble);
        boolean myBoolean;
        if (moduloMyTotalDouble == 0) {
            myBoolean = true;   // 5
        } else {
            myBoolean = false;
        }
        System.out.println(myBoolean);  // 6

        if (!myBoolean) {
            System.out.println("Got some remainder");   // 7
        }
       //  -------------------------------------------------------------

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("MyValuesTotal = " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("theRemainder = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
