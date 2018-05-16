import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class BreakingTheRecords {

    /*
     * Complete the breakingRecords function below.
     */
    static int[] breakingRecords(int[] score) {
        /*
         * Write your code here.
         */
        int newLow = 0;
        int newHigh = 0;
        int lowCount = 0;
        int highCount = 0;
        int[] result = new int[2];
        if(score != null ){
            for(int i = 0; i < score.length; i++){
                if(i == 0){
                    newHigh = score[i];
                    newLow = score[i];
                    continue;
                }
                if(newLow > score[i]){
                    newLow = score[i];
                    lowCount++;
                }
                else if(newHigh < score[i] ){
                    newHigh = score[i];
                    highCount++;
                }

            }
            result[0] = highCount;
            result[1] = lowCount;
        }
        return result;

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] score = new int[n];

        String[] scoreItems = scan.nextLine().split(" ");

        for (int scoreItr = 0; scoreItr < n; scoreItr++) {
            int scoreItem = Integer.parseInt(scoreItems[scoreItr].trim());
            score[scoreItr] = scoreItem;
        }

        int[] result = breakingRecords(score);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write(" ");
            }
        }

        bw.newLine();

        bw.close();
    }
}
