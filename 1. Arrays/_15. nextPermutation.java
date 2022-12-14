/*
Description of Question : https://leetcode.com/problems/next-permutation/
Input: nums = [1,2,3]
Output: [1,3,2]
*/

import java.util.*;

class NextPermutation{

    public static void swap(int nums[],int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void reverse(int nums[],int a,int b){
        while(a<b) swap(nums,a++,b--);
    }

    public static void nextPermutation(int[] nums) {
        if(nums==null || nums.length<=1) return ;
        int n = nums.length;
        int i = n-2;
        while(i>=0 && nums[i]>nums[i+1]) i--;
        if(i>=0){
            int j=n-1;
            while(nums[j]<nums[i]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        
        nextPermutation(arr);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
