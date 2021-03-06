package problem;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * We are given a linked list with head as the first node.  Let's number the nodes in the list: node_1, node_2, node_3, ... etc.
	Each node may have a next larger value: for node_i, next_larger(node_i) is the node_j.val such that j > i, node_j.val > node_i.val, and j is the smallest possible choice.  If such a j does not exist, the next larger value is 0.
	Return an array of integers answer, where answer[i] = next_larger(node_{i+1}).
	Note that in the example inputs (not outputs) below, arrays such as [2,1,5] represent the serialization of a linked list with a head node value of 2, second node value of 1, and third node value of 5.
 * 
 * 1 <= node.val <= 10^9 for each node in the linked list.
	The given list has length in the range [0, 10000].
 *
 */
public class P1019NextGreaterNodeInLinkedList {

    public int[] nextLargerNodes(ListNode head) {
        List<Integer> result = new ArrayList<>();
    	
        while(head.next!=null) {
	        int val = head.val;
	        ListNode temp = head;
	        while(temp.next!=null) {
		        if(temp.next.val>val) {
		        	val = temp.next.val;
		        	break;
		        }
		        temp = temp.next;
	        }
	        if(val>head.val) {
	        	result.add(val);
	        }
	        else {
	        	result.add(0);
	        }
	        head = head.next;
        }
        result.add(0);
        
    	return result.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public class ListNode {
    	 int val;
    	 ListNode next;
    	 ListNode(int x) { val = x; }
    	 public ListNode() {
    		 
    	 }
    }
    
    
}
