package lev1;
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args){
        String message = greet();
        System.out.println(message);
    }

    static String greet(){
        String greeting = "Hello, welcome to the program!";
        return greeting;
    }
}
