/*
Description of Question : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
Input: prices = [7,1,5,3,6,4]
Output: 5
*/
import java.util.*;

class BuySellStock{
    
    public static int maxProfit(int arr[],int n){
        int mini = arr[0];
        int profit = 0;
        for(int i=1;i<n;i++){
            mini = Math.min(mini,arr[i]);
            profit = Math.max(profit,arr[i]-mini);
        }
        return profit;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(maxProfit(arr,n));
    }
}
