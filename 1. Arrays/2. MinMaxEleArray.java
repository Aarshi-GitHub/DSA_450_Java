/* link to question : https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/

Input Description : First Line conatins value n size of array and next line contains n space separated integers

Input: arr[] = {22, 14, -8, 17, 35, 3}
Output:  Minimum element is: -8
         Maximum element is: 35
*/
import java.util.*;

class MinMaxEleArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        for(int i=0;i<n;i++){
            mini = Math.min(mini,arr[i]);
            maxi = Math.max(maxi,arr[i]);
        }
        System.out.println("Minimum element is : "+mini+"\nMaximum element is : "+maxi);
    }
}
