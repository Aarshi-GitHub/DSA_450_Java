/*
Description of Question : https://www.geeksforgeeks.org/how-to-implement-stack-in-java-using-array-and-generics/
push (100) : top = top + 1 and s[top] = 100 
pop ( )  : top = top - 1
peek ( ) : s[top]
*/

import java.util.*;

class Stack<T>{
    int top;
    int size;
    ArrayList<T> arr;
    Stack(int size){
        this.size = size;
        arr = new ArrayList<T>(size);
        top = -1;
    }
    void push(T obj){
        if(top==size-1){
            System.out.println("Stack Overflow..");
            return;
        }
        arr.add(obj);
        top++;
    }
    
    T peek(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return null;
        }
        return arr.get(top);
    }
    
    void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return ;
        }
        top--;
    }
    boolean empty(){
        return top==-1;
    }
}

class StackUsingArray{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>(5);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.pop();
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.empty());
        s.pop();
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.empty());
        
    }
}
