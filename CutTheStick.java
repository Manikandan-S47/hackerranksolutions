import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        List<Integer> resultArrayList = new ArrayList<Integer>();
        if(arr != null){
            Arrays.sort(arr);//sorting the array
            for(int i = 0; i < arr.length; i++){
                int lengthBeforeCut = 0;
                if(arr[i] > 0){
                    //value before cut
                    int currentNoOfSticks = arr.length - i;
                    resultArrayList.add(currentNoOfSticks);
                    boolean contFlag = makeTheCut(arr, i);
                    System.out.println("contFlag:"+contFlag);
                    if(!contFlag){
                        break;
                    }
                }
            }
        }
        return returnPrimitive(resultArrayList);
    }

    static int[] returnPrimitive(List<Integer> resultArrayList){
        int[] returnArray = new int[resultArrayList.size()];
        for(int i = 0; i < resultArrayList.size(); i++){
            returnArray[i] = resultArrayList.get(i);
        }
        return returnArray;
    }
    static boolean makeTheCut(int[] arr, int startPos){
        System.out.println("called with Array value :["+arr+"] & startpos:"+startPos);
        boolean continueFlag = false;
        int cutValue = -1;
        for(int i = startPos; i < arr.length; i++){
            if(cutValue < 0){
                cutValue = arr[i];
                System.out.println("present cut value:"+cutValue);
            }
            int calcValue = arr[i]-cutValue;
            arr[i] = ( calcValue > 0) ? calcValue : 0;
            if(calcValue > 0){
                continueFlag = true;
            }
        }
        return continueFlag;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
