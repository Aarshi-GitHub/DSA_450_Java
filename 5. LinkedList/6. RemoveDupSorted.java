/*
Description of Question : https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
Input:
LinkedList: 2->2->4->5
Output: 2 4 5
*/

import java.util.*;

class LinkedList{
    Node head = null;
    Node tail = null;
    static class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    
    void insertAtHead(int val){
        if(head==null){
           head = new Node(val);
           tail = head;
        } 
        else{
            Node temp = new Node(val);
            temp.next=head;
            head = temp;
        }
    }
    
    void insertAtTail(int val){
        if(head==null){
            insertAtHead(val);
            return;
        }
        Node temp = new Node(val);
        tail.next = temp;
        tail = tail.next;
    }
    
    Node removeDuplicates(){
        Node temp = head;
        while(temp!=null){
            if(temp.next!=null && temp.data==temp.next.data){
                temp.next = temp.next.next;
            }
            else temp = temp.next;
        }
        return head;
    }
    
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            l1.insertAtTail(sc.nextInt());
        }
        l1.removeDuplicates();
        l1.display();
    }
}
