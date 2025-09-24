package Searching;

public class Practice {
    public static void main(String[] args){
        int[] nums = {2,4,0,1,9};
        int target = 9;

        int ans = linearSearch(nums, target); 
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int element : arr){
            if(element == target){
                return element;
            }
        }

        return -1; 
    }
}
