/*
Description of Question : https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
Input : "test string"
Output : s 2
         t 3
Time Complexity: O(length of String)
Space Complexity: O(NO_OF_CHARS) i.e. 256 maximum
*/

import java.util.*;

class FindDuplicates{
    
    public static void findDup(String str){
        int n = str.length();
        HashMap<Character,Integer> mp = new HashMap<Character,Integer>();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(Character ch : mp.keySet())
            System.out.print((mp.get(ch)>1) ? ch+" "+mp.get(ch)+"\n" : "");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        findDup(str);
    }
}
