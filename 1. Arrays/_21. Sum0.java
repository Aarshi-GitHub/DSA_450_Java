/*
Description of Question : https://practice.geeksforgeeks.org/problems/subarray-with-0-sum-1587115621/1
Input:
5
4 2 -3 1 6

Output: 
Yes

Explanation: 
2, -3, 1 is the subarray 
with sum 0.
*/
import java.util.*;

class Sum0{
    static boolean findsum(int arr[],int n){
        int sum=0;
        int start=0,end=-1;
        int k=0; // target sum
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){ 
            sum+=arr[i];
            if(sum-k==0){
                start = 0;end = i;
                break;
            }
            if(m.containsKey(sum-k)){
                start = m.get(sum-k);
                end = i;
                break;
            }
            m.put(sum,i);
        }
        return end!=-1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(findsum(arr,n))
    }
}
