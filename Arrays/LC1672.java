// 1672. Richest Customer Wealth
// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

// Example :
// Input: accounts = [[1,5],[7,3],[3,5]]
// Output: 10
// Explanation: 
// 1st customer has wealth = 6
// 2nd customer has wealth = 10 
// 3rd customer has wealth = 8
// The 2nd customer is the richest with a wealth of 10.

package Arrays;

public class LC1672 {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        
        for(int[] customer : accounts){
            int sum = 0;
            for(int money : customer){
                sum += money;
            }
            if(sum > maxWealth){
                maxWealth = sum;
            }
        }
        return maxWealth;
    }

    public static void main(String[] args) {
        LC1672 obj = new LC1672();
        int[][] accounts = {{1,5},{7,5},{3,5}};
        System.out.println(obj.maximumWealth(accounts));
    }
}
