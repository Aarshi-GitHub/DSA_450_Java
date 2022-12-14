/*
Description of Question : https://www.geeksforgeeks.org/a-program-to-check-if-strings-are-rotations-of-each-other/

Input: S1 = ABCD, S2 = CDAB
Output: Strings are rotations of each other

Input: S1 = ABCD, S2 = ACBD
Output: Strings are not rotations of each other
*/

import java.util.*;

class CheckRotation{
    
    public static int findFirstChar(String s,int n,char c){
        for(int i=0;i<n;i++)
            if(s.charAt(i)==c) return i;
        return -1;
    }
    
    public static boolean isRotation(String s1,String s2){
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1!=n2) return false;
        int idx = findFirstChar(s2,n2,s1.charAt(0));
        if(idx==-1) return false;
        for(int i=0;i<n1;i++){
            int j = (idx+i)%n2;
            if(s1.charAt(i)!=s2.charAt(j)) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        if (isRotation(s1,s2))
            System.out.println("Strings are rotations of each other");
        else
            System.out.println("Strings are not rotations of each other");
    }
}
