package Basic;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        int sum = 0, product = 1;
        int num = n;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        System.out.println("Sum of digits = " + sum);
        System.out.println("Product of digits = " + product);
        int result = product - sum;
        System.out.println("Result (Product - Sum) = " + result);
    }
}
