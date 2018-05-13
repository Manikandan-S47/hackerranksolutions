import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class AppleAndOrangeCounter {

    /*
     * Complete the countApplesAndOranges function below.
     */
    static void countApplesAndOranges(double s, double t, double a, double b, double[] apples, double[] oranges) {
        /*
         * Write your code here.
         */
        int numberOfApples = 0;
        int numberOfOranges = 0;
        if(apples != null && apples.length > 0){
            for(int i = 0; i < apples.length ; i++){
                double fallPosition = a + apples[i];
                if(fallPosition >= s && fallPosition <= t){
                    numberOfApples++;
                }
            }
        }
        if(oranges != null && oranges.length > 0){
            for(int i = 0; i < oranges.length ; i++){
                double fallPosition = b + oranges[i];
                if(fallPosition >= s && fallPosition <= t){
                    numberOfOranges++;
                }
            }
        }

        System.out.println(numberOfApples);
        System.out.println(numberOfOranges);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scan.nextLine().split(" ");

        double s = Double.parseDouble(st[0].trim());

        double t = Double.parseDouble(st[1].trim());

        String[] ab = scan.nextLine().split(" ");

        double a = Double.parseDouble(ab[0].trim());

        double b = Double.parseDouble(ab[1].trim());

        String[] mn = scan.nextLine().split(" ");

        int m = Integer.parseInt(mn[0].trim());

        int n = Integer.parseInt(mn[1].trim());

        double[] apple = new double[m];

        String[] appleItems = scan.nextLine().split(" ");

        for (int appleItr = 0; appleItr < m; appleItr++) {
            double appleItem = Double.parseDouble(appleItems[appleItr].trim());
            apple[appleItr] = appleItem;
        }

        double[] orange = new double[n];

        String[] orangeItems = scan.nextLine().split(" ");

        for (int orangeItr = 0; orangeItr < n; orangeItr++) {
            double orangeItem = Double.parseDouble(orangeItems[orangeItr].trim());
            orange[orangeItr] = orangeItem;
        }

        countApplesAndOranges(s, t, a, b, apple, orange);
    }
}
