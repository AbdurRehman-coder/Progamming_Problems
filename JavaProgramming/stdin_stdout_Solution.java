package JavaProgramming;

import java.util.Scanner;


// In this challenge, you must read an integer, a double, and a String from stdin,
//  then print the values according to the instructions in the Output Format section below.
//  To make the problem a little easier, a portion of the code is provided for you in the editor.

// Note: If you use the nextLine() method immediately following the nextInt() method,
//  recall that nextInt() reads integer tokens; because of this, 
//  the last newline character for that line of integer input is still queued in the input buffer 
//  and the next nextLine() will be reading the remainder of the integer line (which is empty).

public class stdin_stdout_Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Explanation: A newline character is leftover from sc.nextDouble so sc.nextLine() 
        // is needed to skip over this blank line before assigning s to sc.nextLine()
        //  which is the line that contains the data we want. 
        
        
        scan.close();
        // Write your code here.
        

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}