/*
Description of Question : https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1
Input: ABC
Output:
ABC ACB BAC BCA CAB CBA
*/

import java.util.*;

class FindPermutations{
    
    static void findPer(String s,int i,ArrayList<String> arr){
        if(i==s.length()){
            arr.add(s);
            return;
        }
        for(int j=i;j<s.length();j++){
            s = swap(s.toCharArray(),i,j);
            findPer(s,i+1,arr);
            s = swap(s.toCharArray(),i,j);
        }
    }
    
    static String swap(char[] ch,int i,int j){
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return new String(ch);
    }
    
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> arr = new ArrayList<>();
        findPer(s,0,arr);
        for(String ele : arr) System.out.println(ele);
    }
}
