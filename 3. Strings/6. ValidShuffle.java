/*
Description of Question : https://www.programiz.com/java-programming/examples/check-valid-shuffle-of-strings
is third string valid shuffle of first 2 strings. Valid shuffle include same occurrence of all characters
Input : "XY" "12" "Y1X2"
Output : true

Input : "XY" "12" "Y21XX"
Output : false

*/

import java.util.*;

class ValidShuffle{
    
    static boolean isValid(String s1,String s2,String s3){
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            m.put(s1.charAt(i),m.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int i=0;i<s2.length();i++){
            m.put(s2.charAt(i),m.getOrDefault(s2.charAt(i),0)+1);
        }
        for(int i=0;i<s3.length();i++){
            if(!m.containsKey(s3.charAt(i))) return false;
            m.put(s3.charAt(i),m.get(s3.charAt(i))-1);
            if(m.get(s3.charAt(i))==0) m.remove(s3.charAt(i));
        }
        return m.size()==0;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        System.out.println(isValid(s1,s2,s3));
    }
}

