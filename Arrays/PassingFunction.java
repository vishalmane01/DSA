package Arrays;
import java.util.Arrays;
public class PassingFunction {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        System.out.print("Original array:"+Arrays.toString(arr));
        modifiedArray(arr);
        System.out.println("\nModified array:"+Arrays.toString(arr));

    }
    static void modifiedArray(int[] arr){
        arr[3]=10;
    }
}
