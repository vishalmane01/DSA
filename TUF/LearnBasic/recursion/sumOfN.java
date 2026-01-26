package TUF.LearnBasic.recursion;
import java.util.Scanner;

public class sumOfN {
    static int sumNumbers(int n){
        if (n == 0){
            return 0;
        }
        return n + sumNumbers(n-1);
    }    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to find sum till n: ");
        int n = sc.nextInt();

        System.out.println("Sum of numbers till "+n+" is "+sumNumbers(n));
    }
}
