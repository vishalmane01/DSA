package Basic;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number:");
        float num1 = input.nextFloat();
        System.out.print("Enter second number:");
        float num2 = input.nextFloat();

        float result;

        System.out.println("Enter Choice");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Product");
        System.out.println("4. Division");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Addition of "+num1 +" and "+ num2 + " is " +result);
                break;
            case 2:
                result = num1- num2;
                System.out.println("Substraction of "+num1 +" and "+ num2 + " is " +result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Product of "+num1 +" and "+ num2 + " is " +result);
                break;
            case 4:
            result = num1/num2;
                if (num2 == 0){
                    System.out.println("Division by 0 is not allowed.");
                }else{
                    System.out.println("Division of "+num1 +" and "+ num2 + " is " +result);
                }
                break;
            default:
                System.out.println("Invalid choice.Please select valid option.");
        }
    }    
}
