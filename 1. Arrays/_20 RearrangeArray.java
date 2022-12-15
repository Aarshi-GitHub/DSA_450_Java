/*
Description of Question : https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/
Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}
*/import java.util.*;

class RearrangeArray{
    
    public static void rightRotate(int arr[],int i,int j){
        int temp = arr[j];
        for(int k=j;k>i;k--){
            arr[k] = arr[k-1];
        }
        arr[i] = temp;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0 && arr[i]>0){
                int j=i+1;
                for(;j<n;j++){
                    if(arr[j]>=0) continue;
                    break;
                }
                if(j<n){
                    rightRotate(arr,i,j);
                }
            }
            else if(i%2==1 && arr[i]<0){
                int j=i+1;
                for(;j<n;j++){
                    if(arr[j]<0) continue;
                    break;
                }
                if(j<n){
                    rightRotate(arr,i,j);
                }
            }
            
        }
        for(int ele : arr) System.out.print(ele+" ");
    }
}
