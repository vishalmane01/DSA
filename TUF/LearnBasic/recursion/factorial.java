package TUF.LearnBasic.recursion;
import java.util.Scanner;
public class factorial {
    static int factorialCalc(int n){

        if(n == 0 || n == 1){
            return 1;
        }
        return n*factorialCalc(n-1);
    }    

    public static void main(String[] args){
        Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter a number to find factorial: ");
        int n = sc.nextInt();

        System.out.println(factorialCalc(n));
        
    }
}
