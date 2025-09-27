//smallest element in array that is greater than or equal to target
// arr = {11,21,31,41,51,61,71,81,91,100}, target = 55
// ans = 51

package Searching;

public class FloorNumber {
    public static void main(String[] args){
        int[] arr = {11,21,31,41,51,61,71,81,91,100};
        int target = 55;

        int ans = floorNumber(arr,target);
        System.out.println(ans);
    }
    
    static int floorNumber(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }
        return arr[end]; // at the end of the while loop, end = mid - 1, so arr[end] is the largest number smaller than target
    }
}