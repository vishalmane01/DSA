package TUF.LearnBasic.maths;

public class armstrongNum {
    public static void main(String[] args){
        int n = 371;
        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int lastDigit = 0;

        while(n > 0){
            lastDigit = n % 10;
            sum += lastDigit * lastDigit * lastDigit;
            n = n/10;
        }return sum == original ? true : false;
    }
}
