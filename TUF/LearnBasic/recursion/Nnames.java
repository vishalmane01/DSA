package TUF.LearnBasic.recursion;
import java.util.Scanner;
public class Nnames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        names(n);
    }

    static void names(int n){
    if(n == 0){
        return;
    }
    names(n-1);
    System.out.println(n);

    }
}
