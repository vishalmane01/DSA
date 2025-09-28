// Geeksforgeeks article: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Find position of an element in a sorted array of infinite numbers.

package Searching;

public class SearchInInfiniteNumber {
    public static void main(String[] args){
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 130;
        int ans = findingAns(arr, target);
        System.out.println(ans);
    }    

    static int findingAns(int[] arr, int target){
        int start = 0;
        int end = 1;

        // expand the range safely
        while(end < arr.length && target > arr[end]){
            int newStart = end + 1;

            // double the window size
            end = end + (end - start + 1) * 2;

            // make sure end does not go out of bounds
            if(end >= arr.length){
                end = arr.length - 1;
            }
            start = newStart;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid; // found
            }
        }
        return -1; // not found
    }
}
