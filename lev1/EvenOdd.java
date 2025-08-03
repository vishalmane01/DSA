package lev1;
import java.util.Scanner;
public class EvenOdd {
    static int checkEvenOdd(int number){
        if(number % 2 == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int num = sc.nextInt();
        int result = checkEvenOdd(num);
        if(result == 1){
            System.out.println(num + " is even number.");
        }else{
            System.out.println(num + " is odd number.");
        }
    }    
}
