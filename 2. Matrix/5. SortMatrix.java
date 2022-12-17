/*
Description of Question : https://practice.geeksforgeeks.org/problems/sorted-matrix2333/1
Input:
N=4
Mat=[[10,20,30,40],
[15,25,35,45] 
[27,29,37,48] 
[32,33,39,50]]
Output:
10 15 20 25 
27 29 30 32
33 35 37 39
40 45 48 50
*/
import java.util.*;

class SortMatrix{
    static int[][] sortedMatrix(int N, int Mat[][]){
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i= 0; i<N; i++){
            for(int j = 0;j<N; j++){
                q.add(Mat[i][j]);
            }
        }
        for(int i =0; i<N; i++){
            for(int j = 0; j<N; j++){
                Mat[i][j]=q.remove();
            }
        }
        return Mat;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) arr[i][j] = sc.nextInt();
        }
        
        arr = sortedMatrix(n,arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
