package lev1;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        for (int i=0; i<=10;i++){
        sum();
        }
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        int num1 , num2 , sum;
        System.out.println("Enter a number: ");
        num1 = sc.nextInt();

        System.out.println("Entoer another number: ");
        num2 = sc.nextInt();
        sum = num1 + num2;

        System.out.println("Sum of "+num1+ " and "+num2+ " is:" +sum);
    }
}
