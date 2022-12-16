/*
Description of Question : https://practice.geeksforgeeks.org/problems/longest-repeating-subsequence2004/1
Input:
str = "axxzxy"
Output: 2
*/

import java.util.*;

class LongestRepeatingSubsequence{
    
    static int longestRepeating(String str){
        int n = str.length();
        int dp[][] = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(str.charAt(i-1)==str.charAt(j-1) && i!=j) dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[n][n];
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(longestRepeating(s));
    }
}
