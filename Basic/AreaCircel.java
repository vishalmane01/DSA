package Basic;
import java.util.Scanner;
public class AreaCircel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        
        System.out.println("Area of the circle is: " + area);
        
        
    }
}


