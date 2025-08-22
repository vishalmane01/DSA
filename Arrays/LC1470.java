package Arrays;

public class LC1470 {
    public static void main(String[] args){
        
    }
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            result[index++] = nums[i];     // xi
            result[index++] = nums[i + n]; // yi
        }
        return result;
    }
}
