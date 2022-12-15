/*
Question Description : https://practice.geeksforgeeks.org/problems/common-elements1132/1
Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
*/
import java.util.*;

class CommonElements {
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        int i=0,j=0,k=0;
        ArrayList<Integer> arr = new ArrayList<>();
        while(i<n1 && j<n2 && k<n3){
            if(A[i]==B[j] && B[j]==C[k]){
                if(arr.size()==0 || arr.get(arr.size()-1)!=A[i])
                arr.add(A[i]);
                i++;j++;k++;
            }
            if(i<n1 && j<n2 && k<n3 && (A[i]<B[j] || A[i]<C[k])) i++;
            if(i<n1 && j<n2 && k<n3 && (B[j]<A[i] || B[j]<C[k])) j++;
            if(i<n1 && j<n2 && k<n3 && (C[k]<A[i] || C[k]<B[j])) k++;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int A[] = new int[n1];
        int B[] = new int[n2];
        int C[] = new int[n3];
        for(int i=0;i<n1;i++) A[i] = sc.nextInt();
        for(int i=0;i<n2;i++) B[i] = sc.nextInt();
        for(int i=0;i<n3;i++) C[i] = sc.nextInt();
        ArrayList<Integer> res = commonElements(A,B,C,n1,n2,n3);
        for(int ele:res)
            System.out.print(ele+" ");
    }
}
