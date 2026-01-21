package TUF.LearnBasic.recursion;
import java.util.Scanner;
public class Nnames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        names(n);
    }

    static void names(int n){
    if(n == 0){
        return;
    }
    System.out.println("Vishal");
    names(n-1);
    }
}
