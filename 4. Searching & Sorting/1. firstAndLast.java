/*
Description of Question : https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
Input:
n=9, x=5
arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
Output:  2 5
*/
import java.util.*

class firstAndLast{
    
    public static long firstOccur(long arr[],int s,int e, int x){
        int res = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==x){
                res = mid;
                e = mid-1;
            }
            else if(arr[mid]>x) e = mid-1;
            else s = mid+1;
        }
        return res;
    }
    
    public static long lastOccur(long arr[],int s,int e, int x){
        int res = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(arr[mid]==x){
                res = mid;
                s = mid+1;
            }
            else if(arr[mid]>x) e = mid-1;
            else s = mid+1;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        System.out.print(firstOccur(arr,0,n-1,x)+" ");
        System.out.print(lastOccur(arr,0,n-1,x));
    }
}
