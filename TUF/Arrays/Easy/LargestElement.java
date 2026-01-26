package TUF.Arrays.Easy;
// Example 1:
// Input: arr[] = {2, 5, 1, 3, 0}  
// Output: 5  
// Explanation: 5 is the largest element in the array.

public class LargestElement {
    public static int findLargest(int[] nums){
        int largest = nums[0];
        for(int i = 1; i < nums.length ; i++){
            if(largest<nums[i]){
                largest = nums[i];
            }
        }
        return largest;
    }

    public static void main(String[] args){
        int[] nums = {3,4,8,1,2,0};
        int max = findLargest(nums);
        System.out.print("Largest element in array is:"+max);
    }
}
