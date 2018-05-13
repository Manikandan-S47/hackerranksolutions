import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean meets = false;
        if(v1 < v2){
            meets = false;
        }
        else{
            while(x1 <= x2){
                if(x1 == x2){
                    meets = true;
                    break;
                }
                else{
                    x1 = x1 + v1;
                    x2 = x2 + v2;
                }
            }

        }
        if(meets){
            return "YES";
        }
        else{
            return "NO";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println(result);
    }
}
