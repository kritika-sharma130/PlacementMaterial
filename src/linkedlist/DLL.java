/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 10-11-2021
 *   Time: 01:43
 *   File: DLL.java
 */

package linkedlist;

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

    public DLL(ListNode head, ListNode tail, int length) {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return length==0;
        //This above line can also be written as head==null
    }
    public void insertAtStart(){
        ListNode newnode = new ListNode(7);
        if(isEmpty()){
            tail=newnode;
        }else {
            head.previous = newnode;
        }newnode.next=head;
        head=newnode;

    }

    public static void main(String[] args) {

    }
}
