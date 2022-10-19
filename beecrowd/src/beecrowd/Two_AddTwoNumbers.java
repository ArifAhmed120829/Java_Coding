package beecrowd;

import java.util.LinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
    }
}
*/

public class Two_AddTwoNumbers {

	public static void main(String[] args) {
		// Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();
 
        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
 
        System.out.println(ll);
 
        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
 
        System.out.println(ll);

	}

}
