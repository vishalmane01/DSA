package TUF.Arrays.Easy;


// Example 1:
// Input: [1, 2, 4, 7, 7, 5]  
// Output:
// Second Smallest : 2  
// Second Largest : 5 

public class SecondLargestElement {
    public static int secondLargest(int[] nums){
        int largest = nums[0];
        int secondLargest = -1;

        for (int i=1; i < nums.length; i++){
            if(nums[i]>largest){
                secondLargest = largest;
                largest = nums[i];
            }
            if(nums[i] < largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
    
    public static int secondSmallest(int[] nums){
        int smallest = nums[0];
        int secondSmallest = -1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i]<smallest){
                secondSmallest = smallest;
                smallest = nums[i];
            }
            if(nums[i] > smallest && (secondSmallest == -1 || nums[i] < secondSmallest)){
                secondSmallest = nums[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args){
        int[] nums = {8, 2, 4, 7, 7, 5};
        System.out.println("Second Smallest : " + secondSmallest(nums));
        System.out.println("Second Largest : " + secondLargest(nums));
    }
}
