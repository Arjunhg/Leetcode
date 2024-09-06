package Leetcode.September;

import java.util.HashSet;

public class P3217 {

    public class ListNode {
            int val;
            ListNode next;
            ListNode() {}
            ListNode(int val) { this.val = val; }
            ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

     public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode curr = dummy;
        HashSet<Integer> remNum = new HashSet<>();
        for(int num : nums){
            remNum.add(num);
        }
        while(curr.next!=null){
            if(remNum.contains(curr.next.val)){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        
    }
}
