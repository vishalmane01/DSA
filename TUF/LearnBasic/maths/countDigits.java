// Example 1:
// Input:N = 12345
// Output:5
// Explanation:  The number 12345 has 5 digits.
                        
// Example 2:
// Input:N = 7789              
// Output: 4
// Explanation: The number 7789 has 4 digits.

package TUF.LearnBasic.maths;

public class countDigits {
    public static void main(String[] args){
        int n = 785412;
        System.out.println(count(n));
    }

    static int count(int n){
        int count = 0;
        while(n > 0){
            count++;
            n = n/10;
        }
        return count;
    }

}
