
// Basic input and output of array

package Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // int[] arr = new int[5];

        // System.out.println("Enter 5 numbers:");
        // for (int i = 0; i < arr.length; i++){
        //     arr[i] = input.nextInt();
        // }
        
        // System.out.println("You entered:");
        // for (int i = 0; i < arr.length; i++){
        //     System.out.print(arr[i]+" ");
        // }

        // System.out.println();
        // System.out.println("Using toString method:");
        // System.out.println(Arrays.toString(arr));

        String str[] = new String[4];
        System.out.println("Enter 4 strings:");
        for (int i = 0;i <str.length ; i++){
            str[i] = input.nextLine();
        }

        System.out.println("You entered:");
        System.out.println(Arrays.toString(str));

    }
}
