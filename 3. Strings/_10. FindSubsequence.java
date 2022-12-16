/*
Description of Question : https://www.geeksforgeeks.org/print-subsequences-string/
Input : abc
Output : a, b, c, ab, bc, ac, abc
*/

import java.util.*;

class FindSubsequence{
    
    static void findSubs(String s,String ans,ArrayList<String> arr){
        if(s.length()==0){
            arr.add(ans);
            return;
        }
        findSubs(s.substring(1),ans+s.charAt(0),arr);
        findSubs(s.substring(1),ans,arr);
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> arr = new ArrayList<>();
        findSubs(s,"",arr);
        for(String ele : arr) System.out.println(ele);
    }
}
