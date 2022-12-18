/*
Description of Question : https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
Input:
N = 2
valueN[] = {4,5}
M = 3
valueM[] = {3,4,5}
Output: 3 9 0  
*/


class Solution{
    
    static Node addLists(Node head1,Node head2){
        Node head = null;
        Node temp = head;
        Node temp1 = head1;
        Node temp2 = head2;
        int carry = 0;
        while(temp1!=null && temp2!=null){
            int sum = temp1.data + temp2.data + carry;
            if(temp==null){
                temp = new Node(sum%10);
                head = temp;
            }
            else{
                Node n = new Node(sum%10);
                temp.next = n;
                temp = temp.next;
            }
            carry = sum/10;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1!=null ||temp2!=null || carry!=0){
            int sum = carry;
            if(temp1!=null){
                sum+=temp1.data;
                temp1 = temp1.next;
            }
            else if(temp2!=null){
                sum+=temp2.data;
                temp2 = temp2.next;
            }
            if(temp==null){
                temp = new Node(sum%10);
                head = temp;
            }
            else{
                Node n = new Node(sum%10);
                temp.next = n;
                temp = temp.next;
            }
            carry = sum/10;
        }
        temp = head;
        return reverse(head);
    }
    
    static Node reverse(Node head){
        if(head==null || head.next==null) return head;
        Node newHead = reverse(head.next);
        head.next.next = head;
        head.next=null;
        return newHead;
    }
    
    static Node addTwoLists(Node first, Node second){
        Node res = addLists(reverse(first),reverse(second));
        return res;
    }
}
