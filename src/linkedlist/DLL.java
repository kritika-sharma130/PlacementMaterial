/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 10-11-2021
 *   Time: 01:43
 *   File: DLL.java
 */

package linkedlist;

import java.util.NoSuchElementException;

//DDL refers to a doubly linked list
public class DLL {
    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {
        private  int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }

    }

    /*public DLL(ListNode head, ListNode tail, int length) {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    */

    public boolean isEmpty(){
        return head==null;
        //This above line can also be written as head==null
    }
    public void insertAtStart(int value){
        ListNode newnode = new ListNode(value);
        if(isEmpty()){
            tail=newnode;
        }else {
            head.previous = newnode;
        }newnode.next=head;
        head=newnode;
    }
    public void insertAtLast(int value){
        ListNode newnode = new ListNode(value);
        if(isEmpty()){
            head=newnode;
        }
        else{
            tail.next=newnode;
            newnode.previous=tail;
        }
        tail=newnode;
    }
    public void displayForward(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    public void displayBackward(){
        ListNode temp=tail;
        while (temp!=null){
            System.out.print(temp.data+"----->");
            temp=temp.previous;
        }
        System.out.print("null");

    }
    public ListNode deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if (head == tail) {
          tail=null;
        }else{
            head.next.previous=null;
        }head=head.next;
        temp.next=null;
        return temp;
    }
    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp=tail;
        if(head==tail){
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        temp.previous=null;
        return temp;
    }


    public static void main(String[] args) {
    DLL dll = new DLL();
    dll.insertAtStart(78);
    dll.insertAtStart(9);
    dll.insertAtStart(88);
    dll.insertAtStart(91);
    dll.deleteFirst();
    dll.deleteLast();
    dll.displayForward();
    }
}
