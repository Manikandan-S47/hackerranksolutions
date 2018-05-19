import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class MigratedBirds {

    // Complete the migratoryBirds function below.
    static int migratoryBirds(int n, int[] ar) {
        int counterArr[] = new int[5];
        int maxTypeOfBird = 0;
        int returnBirdType = -1;
        
        for(int i = 0; i < ar.length ; i++){
            if(ar[i] == 1){
                maxTypeOfBird = addBirdCount(0, counterArr, maxTypeOfBird);
            }
            else if(ar[i] ==  2){
                maxTypeOfBird = addBirdCount(1, counterArr, maxTypeOfBird); 
            }
            else if(ar[i] ==  3){
                maxTypeOfBird = addBirdCount(2, counterArr, maxTypeOfBird);                     
            }
            else if(ar[i] ==  4){
                maxTypeOfBird = addBirdCount(3, counterArr, maxTypeOfBird);               
            }
            else if(ar[i] ==  5){
                maxTypeOfBird = addBirdCount(4, counterArr, maxTypeOfBird);               
            }            
        }
        
        for(int i = 0; i < counterArr.length; i++ ){
            if(counterArr[i] == maxTypeOfBird){
                returnBirdType = i +1;
                break;
            }
        }
        return returnBirdType;
    }
    
    static int addBirdCount(int typeOfBird, int[] counterArr, int maxTypeOfBird){
        int temp = counterArr[typeOfBird];
        temp++;
        counterArr[typeOfBird] = temp;
        if(maxTypeOfBird < temp){
            maxTypeOfBird = temp;
        }
        return maxTypeOfBird;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr]);
            ar[arItr] = arItem;
        }

        int result = migratoryBirds(arCount, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
