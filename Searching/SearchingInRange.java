package Searching;

public class SearchingInRange {
    public static void main(String[] args){
        int [] arr = {1,2,3,54,9,8};
        int target = 54;

        int ans = LinearSearchInRange(arr, target , 1 , arr.length -1);
        System.out.println(ans);

    }

    static int LinearSearchInRange(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }

        for(int i=start; i<=end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
