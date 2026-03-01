import java.util.Scanner;

public class add {
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your values");
        System.out.println("Enter your 1st value ");
        int a = sc.nextInt();
        System.out.println("Enter your 2nd value");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println(sum);
        System.out.println("your addition number");
    }
}
