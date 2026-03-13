import java.util.Scanner;

public class ifelse {


    public static void main (String args []){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first value");
        int a = sc.nextInt();
        System.out.println("Enter your 2nd value");
        int b = sc.nextInt();

        if (a == b){
            System.out.println("equal");
        } else if (a > b) {
            System.out.println(" a is greater ");
            
        } else { 
            System.out.println(" a is lessthan");
        }
    }
}