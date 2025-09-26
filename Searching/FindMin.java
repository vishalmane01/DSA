package Searching;

public class FindMin {
    public static void main(String[] args){
        int[] arr = {72,4,6,7,8,9,5,73,14,7,66,};

        int ans = findMinimum(arr);
        System.out.println(ans);
    }

    static int findMinimum(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        int min = arr[0];
        for (int element : arr){
            if(min > element){
                min = element;
            }
        }
        return min;
    }
}
