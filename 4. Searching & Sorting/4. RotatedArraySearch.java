/*
Description of Question : https://leetcode.com/problems/search-in-rotated-sorted-array/
Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
*/

import java.util.*;

class RotatedArraySearch{
    
    static int search(int[] nums, int target) {
        int s = 0,e = nums.length-1;
        while(s<e){
            int mid = (s+e)/2;
            if(nums[mid]==target) return mid;
            if(nums[s] < nums[mid]){ // left part is sorted
                if(nums[mid] > target && target >= nums[s]) e = mid;
                else s = mid;
            }
            else{ // right part is sorted
                if(nums[mid] < target && nums[e]>=target) s = mid;
                else e = mid;
            }
        }
        return -1;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int target = sc.nextInt();
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.println(search(arr,target));
    }
}
