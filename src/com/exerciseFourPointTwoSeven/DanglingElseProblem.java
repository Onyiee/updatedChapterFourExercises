package com.exerciseFourPointTwoSeven;
//4.27 (Dangling-else Problem) Determine the output for each of the given sets of code when x
//        is 9 and y is 11 and when x is 11 and y is 9. The compiler ignores the indentation in a Java program.
//        Also, the Java compiler always associates an else with the immediately preceding if unless told to
//        do otherwise by the placement of braces ({}). On first glance, you may not be sure which if
//        a particular else matches—this situation is referred to as the “dangling-else problem.”
//        We’ve eliminated the indentation from the following code to make the problem more challenging.
//        [Hint: Apply
//        the indentation conventions you’ve learned.]
//        a) if (x < 10)
//        if (y > 10)
//        System.out.println("*****");
//        else
//        System.out.println("#####");
//        System.out.println("$$$$$");
//        b) if (x < 10)
//        {
//        if (y > 10)
//        System.out.println("*****");
//        }
//        else
//        {
//        System.out.println("#####");
//        System.out.println("$$$$$");
//        }
//

import java.util.Scanner;

public class DanglingElseProblem {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        if(x < 10){
            if (y > 10){
                System.out.println("*****");
            } else{
                System.out.println("#####");
            }
        System.out.println("$$$$$");
        }


        if (x < 10)
        {
        if (y > 10)
        System.out.println("*****");
        else
        {
            System.out.println("#####");
        }

        System.out.println("$$$$$");
        }
    }


}
