/*
Description of Question : https://practice.geeksforgeeks.org/problems/count-squares3649/1
Input : 
  N = 9
Output : 
  2
*/

import java.util.*;

class CountSquares{
    
    static int countSq(int N){
        long s = 1,e = N;
        long res = 0;
        while(s<=e){
            long mid = s + (e-s)/2;
            if(mid*mid<=N){
                res = mid;
                s = mid+1;
            }
            else e = mid-1;
        }
        if(res*res==N) return (int)res-1;
        return (int)res;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countSq(n));
    }
}
