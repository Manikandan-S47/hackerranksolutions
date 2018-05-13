package com.algorithm.implementation;

import java.io.IOException;
import java.util.Scanner;

public class GradingStudents {

    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */
        if(grades != null && grades.length > 0){
            for(int i = 0; i < grades.length ; i++){
                if(grades[i] < 38){
                    continue;
                }
                else{
                    int diff = 5 - (grades[i] % 5);
                    System.out.println("diff for"+ grades[i]+" is :"+diff);
                    if(diff < 3){
                    	grades[i] = grades[i] + diff;
                    }
                    else{
                        continue;
                    }
                }
            }
        }
        return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);
        for(Integer i : result) {
        	System.out.println(i);
        }
    }
}
