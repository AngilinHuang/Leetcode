package problem;

import java.util.Arrays;

import problem.P1019NextGreaterNodeInLinkedList.ListNode;

import org.junit.Test;

public class P1019Test {
	
	@Test
	public void test1() {
    	P1019NextGreaterNodeInLinkedList p = new P1019NextGreaterNodeInLinkedList();
    	int[] test = {1,7,5,1,9,2,5,1};
    	ListNode head = p.new ListNode();
    	for(int i=test.length-1;i>0;i--) {
    		head.val = test[i];
    		ListNode temp = p.new ListNode();
    		temp.next = head;
    		head = temp;
    	}
    	head.val = test[0];
    	
    	int[] result = p.nextLargerNodes(head);
    	int[] answer = {7,9,9,9,0,5,0,0};
    	assert Arrays.equals(result, answer);
    }
	
	@Test
	public void test2() {
    	P1019NextGreaterNodeInLinkedList p = new P1019NextGreaterNodeInLinkedList();
    	int[] test = {2,7,4,3,5};
    	ListNode head = p.new ListNode();
    	for(int i=test.length-1;i>0;i--) {
    		head.val = test[i];
    		ListNode temp = p.new ListNode();
    		temp.next = head;
    		head = temp;
    	}
    	head.val = test[0];
    	
    	int[] result = p.nextLargerNodes(head);
    	int[] answer = {7,0,5,5,0};
    	assert Arrays.equals(result, answer);
    }
}
