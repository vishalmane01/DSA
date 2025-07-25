package Basic;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string:");

        String str = input.nextLine();
        String rev = "";

        for(int i = str.length()-1 ; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }
    }
}
