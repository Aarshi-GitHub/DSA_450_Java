/*
Description of Question : https://leetcode.com/problems/find-the-duplicate-number/
Input: nums = [1,3,4,2,2]
Output: 2
*/

import java.util.*;

class MinJump{
    
    static void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;){
            if(nums[i]!=nums[nums[i]-1]) swap(nums,nums[i]-1,i);
            else i++;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1) return nums[i];
        }
        return -1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(findDuplicate(arr));
    }
}
