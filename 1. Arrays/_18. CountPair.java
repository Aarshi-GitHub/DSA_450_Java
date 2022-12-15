/*
Description of Question : https://practice.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1
N = 4, K = 6
arr[] = {1, 5, 7, 1}
*/

import java.util.*;

class CountPair{
    
    static int getPairsCount(int[] arr, int n, int k){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(!hm.containsKey(k-arr[i])) continue;
            count+= hm.get(k-arr[i]);
            if(k-arr[i]==arr[i]){
                count--;
            }
        }
        return count/2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(getPairsCount(arr,n,k));
    }
}
