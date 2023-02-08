/*
Description of Question : https://practice.geeksforgeeks.org/problems/diameter-of-binary-tree/1

Input: 10 20 30 40 60

         10
        /   \
      20    30
    /   \ 
   40   60
   
Output: 4

*/

import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree{
    Node root;
    BinaryTree(){
        root = null;
    }
    
    Node buildfromLevelOrder(int arr[],int i){
        Node node = null;
        if(i<arr.length && arr[i]!=-1){
            node = new Node(arr[i]);
            node.left = buildfromLevelOrder(arr,2*i+1);
            node.right = buildfromLevelOrder(arr,2*i+2);
        }
        return node;
    }
    
    int height(Node node){
        if(node==null) return 0;
        return 1+ Math.max(height(node.left),height(node.right));
    }
    
    int[] diameterFast(Node node){
        if(node==null) return new int[]{0,0};
        int[] leftTree = diameterFast(node.left);
        int[] rightTree = diameterFast(node.right);
        int op1 = leftTree[0];
        int op2 = rightTree[0];
        int op3 = 1 + leftTree[1] + rightTree[1];
        int h = 1 + Math.max(leftTree[1] , rightTree[1]);
        int d = Math.max(op1,Math.max(op2,op3));
        return new int[]{d,h};
    }
    
    int diameter(Node node){
        if(node==null) return 0;
        int op1 = diameter(node.left);
        int op2 = diameter(node.right);
        int op3 = 1 + height(node.left) + height(node.right);
        return Math.max(op1,Math.max(op2,op3));
    }
    
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        bt.root = bt.buildfromLevelOrder(arr,0);
        int[] res = bt.diameterFast(bt.root);
        System.out.println("Diameter using traditional method : "+bt.diameter(bt.root));
        System.out.println("Diameter using faster method : "+res[0]);
    }
}
