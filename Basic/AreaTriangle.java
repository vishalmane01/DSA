package Basic;
import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base of triangle:");
        double b = input.nextDouble();

        System.out.print("Enter height of triangle:");
        double h = input.nextDouble();

        double area = (b*h)/2 ;

        System.out.println("Area of right angled triangle:"+area);
    }
}
