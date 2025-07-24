package Basic;
import java.util.Scanner;

public class SI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principle amount:");
        int P = input.nextInt();

        System.out.print("Enter rate of intrest:");
        int R = input.nextInt();

        System.out.print("Enter rate of time duration:");
        int T = input.nextInt();

        int SI = (P * R * T) / 100;
        System.out.println("Simple intrest is: "+SI);

        int A = (P + SI );
        System.out.println("Total amount with intrest will be "+A);
    }
}