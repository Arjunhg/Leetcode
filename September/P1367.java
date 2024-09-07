package Leetcode.September;

public class P1367 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        return searchInTree(head, root);
    }

    public boolean searchInTree(ListNode head, TreeNode root) {
        if (root == null) {
            return false; 
        }
    
        if (dfs(head, root)) {
            return true;
        }
        
        return searchInTree(head, root.left) || searchInTree(head, root.right);
    }


    public boolean dfs(ListNode head, TreeNode root) {
        if (head == null) {
            return true;  
        }
        if (root == null) {
            return false; 
        }
        
        if (head.val == root.val) {
            return dfs(head.next, root.left) || dfs(head.next, root.right);
        }
       
        return false;
    }
    
    public static void main(String[] args) {
        
    }
}
