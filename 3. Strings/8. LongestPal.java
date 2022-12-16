/*
Description of Question : https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1
S = "aaaabbaa"
Output: aabbaa
*/

import java.util.*;

class MatrixMedian{
    
    static String longestPalin(String s){
        int n = s.length();
        int st = 0,len=0;
        boolean dp[][] = new boolean[n][n];
        for(int g=0;g<n;g++){
            for(int i=0,j=g;j<n;i++,j++){
                if(g==0){
                    dp[i][j] = true;
                }
                else if(g==1){
                    dp[i][j] = (s.charAt(i)==s.charAt(j));
                }
                else{
                    dp[i][j] = (s.charAt(i)==s.charAt(j) && dp[i+1][j-1]);
                }
                if(dp[i][j]==true && g+1>len){
                    st = i; len = g+1;
                } 
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0;i<len;i++){
            res.append(s.charAt(st+i));
        }
        return res.toString();
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(longestPalin(s));
    }
}
