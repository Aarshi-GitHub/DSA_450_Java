/*
Description of Question : https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
Input:
N = 3
value[] = {1,3,4}
x(position at which tail is connected) = 2
Output: True
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
    
    void createLoop(int k){
        if(head==null || k==0) return ;
        Node temp = head;
        while(k!=1){
            temp = temp.next;
            k--;
        }
        tail.next = temp;
    }
    
    boolean detectLoop(Node head){
        if(head==null || head.next==null) return false;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) break;
        }
        return slow==fast;
    }
    
    void display(Node head){
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
        int k = sc.nextInt();
        l1.createLoop(k);
        System.out.println(l1.detectLoop(l1.head));
    }
}
