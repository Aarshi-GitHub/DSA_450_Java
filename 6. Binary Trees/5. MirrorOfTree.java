/*
Description of problem : https://www.geeksforgeeks.org/create-a-mirror-tree-from-the-given-binary-tree/

Input: 5 3 6 2 4
        5
       / \
      3   6
     / \
    2   4
    
Output:

Inorder of original tree: 2 3 4 5 6 
Inorder of mirror tree: 6 5 4 3 2

Mirror tree will be:
  5
 / \
6   3
   / \
  4   2

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
    
    void inorder(Node node){
        if(node==null) return;
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
    }
    
    Node createMirror(Node node){
        if(node==null) return null;
        Node mirrorNode = new Node(node.data);
        mirrorNode.left = createMirror(node.right);
        mirrorNode.right = createMirror(node.left);
        return mirrorNode;
    }
    
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        bt.root = bt.buildfromLevelOrder(arr,0);
        System.out.print("Inorder of Original Tree : ");
        bt.inorder(bt.root);
        BinaryTree mirror = new BinaryTree();
        mirror.root = mirror.createMirror(bt.root);
        System.out.print("\nInorder of Mirror Tree : ");
        mirror.inorder(mirror.root);
    }
}
