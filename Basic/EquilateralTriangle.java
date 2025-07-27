package Basic;
import java.util.Scanner;
public class EquilateralTriangle {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter side of equilateral triangle: ");
    double side = input.nextDouble();

    double area = Math.sqrt(3) / 4 * side*side;
    System.out.println("Area of equilateral triangle: " + area);
}  
}
