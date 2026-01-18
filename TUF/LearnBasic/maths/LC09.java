package TUF.LearnBasic.maths;

public class LC09 {
    public static void main(String[] args) {
        int n = 5115;
        System.out.println(isPalindrome(n));
    }

    static boolean isPalindrome(int n){
        int original = n;
        int rev = 0;

        if(n < 0 || (n % 10 == 0 && n != 0)){
            return false;
        }

        while(n!=0){
            int lastDigit = n%10;
            n = n/10;
            rev = rev*10 + lastDigit;
        } return original == rev ? true : false;
        
    } 
}
