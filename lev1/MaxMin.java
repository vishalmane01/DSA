package lev1;
import java.util.Scanner;

public class MaxMin{

    static int findMax(int a, int b, int c){
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    static int findMin(int a, int b, int c){
        int min = a;
        if (b < min) min = b;
        if (c < min ) min = c;
        return min;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        System.out.println("Maximum of the three numbers is: " + findMax(num1, num2, num3));
        System.out.println("Minimum of the three numbers is: " + findMin(num1, num2, num3));
    }
}