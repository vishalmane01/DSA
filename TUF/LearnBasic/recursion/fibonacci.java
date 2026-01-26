package TUF.LearnBasic.recursion;
import java.util.Scanner;

public class fibonacci {
    static int fibonacciCalc(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacciCalc(n-1) + fibonacciCalc(n-2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find fiboonacci series till n: ");
        int n = sc.nextInt();

        System.out.println("Fibonacci series till "+n+" terms: "+fibonacciCalc(n));
    }
}