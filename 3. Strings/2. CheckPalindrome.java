/*
Description of Question : https://practice.geeksforgeeks.org/problems/palindrome-string0817/1
Input: S = "abba"
Output: 1
Time Complexity: O(Length of S)
Auxiliary Space: O(1)
*/

import java.util.*;

class CheckPalindrome{
    
    public static boolean checkPal(String str){
        int s = 0;
        int e = str.length()-1;
        while(s<e){
            if(str.charAt(s)!=str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(checkPal(str)?1:0);
    }
}
