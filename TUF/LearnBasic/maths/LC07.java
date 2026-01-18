// 7. Reverse Integer
// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

// Example 1:
// Input: x = 123
// Output: 321

// Example 2:
// Input: x = -123
// Output: -321

// Example 3:
// Input: x = 120
// Output: 21

package TUF.LearnBasic.maths;

public class LC07 {
    public static void main(String[] args) {
        int x = 123456789;
        System.out.println(reverse(x));
    }

    static int reverse(int n){
        int rev = 0;
        while(n != 0){
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }return rev;
    }
}
