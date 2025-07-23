package Basic;
import java.util.Scanner;
public class Product {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num1 = input.nextFloat();
        System.out.print("Enter another number: ");
        float num2 = input.nextFloat();

        float product = num1*num2;

        System.out.print("Product of two number is "+product);
    }
}
