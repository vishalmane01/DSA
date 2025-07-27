package Basic;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = input.nextInt();

        int first = 0, second = 1, next;

        for (int i=1; i<=terms;i++){
            System.out.print(first+ " ");
            next = first + second;
            first = second;
            second = next;
        }
    }
}
