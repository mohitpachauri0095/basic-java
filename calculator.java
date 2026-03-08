package project;

import java.util.Scanner;

public class calculator {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your 1st value");
        int value=sc.nextInt();
        System.out.println("Enter your 2nd value");
           int value1=sc.nextInt();
           int sum = value+value1;
           int sub = value - value1;
              int mul = value*value1;
           int devid = value / value1;

           System.out.println(sum);
             System.out.println(sub);
               System.out.println(mul);
                 System.out.println(devid);    
                 System.out.println("your final answer");
        }     
}
