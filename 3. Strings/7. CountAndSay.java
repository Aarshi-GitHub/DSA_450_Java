/*
Description of Question : https://leetcode.com/problems/count-and-say/description/
Input: n = 4
Output: "1211"
*/

import java.util.*;

class CountAndSay{
    
    static String countAndSay(int n) {
        String res = "1";
        while(n>1){
            StringBuilder cur = new StringBuilder();
            for(int i=0;i<res.length();i++){
                int count=1;
                while(i+1<res.length() && res.charAt(i)==res.charAt(i+1)){
                    count++;
                    i++;
                }
                cur.append(count).append(res.charAt(i));
            }
            res = cur.toString();
            n--;
        }
        return res;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countAndSay(n));
    }
}
