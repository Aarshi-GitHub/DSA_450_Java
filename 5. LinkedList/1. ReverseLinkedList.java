/*
Description of Question : https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
Input:
LinkedList: 1->2->3->4->5->6
Output: 6 5 4 3 2 1
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
    
    void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    
    Node reverseIter(){
        Node prev = null;
        Node cur = head;
        Node nxtptr;
        while(cur!=null){
            nxtptr = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nxtptr;
        }
        return prev;
    }
    
    Node reverseRec(Node head){
        if(head==null || head.next==null) return head;
        Node newHead = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        int n = sc.nextInt();
        for(int i=0;i<6;i++){
            l1.insertAtTail(sc.nextInt());
        }
        l1.head = l1.reverseRec(l1.head);
        System.out.print("Recursive Reverse : ");
        l1.display(l1.head);
        System.out.println();
        l1.head = l1.reverseRec(l1.head);
        System.out.print("Iterative Reverse : ");
        l1.display(l1.head);
    }
}
