
// In order-Agnostic binary search, the array can be sorted in either ascending or descending order.

package Searching;

public class OrderAgnostic {
    public static void main(String[] args){

        int[] nums = {10,9,8,7,6,5,4,3,2,1};
        int target = 1;

        int ans = orderAgnosticBinarySearch(nums, target);
        System.out.println(ans);
    }

    static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        boolean isAsc = arr[start] < arr[end]; // this checks if the array is sorted in ascending order or not

        while(start <= end){
            // find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            // if the array is sorted in ascending order
            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }

            }else{ // if the array is sorted in descending order
                if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
