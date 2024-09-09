package Leetcode.September;

public class P2326 {
    public class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        }

    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int[][] result = new int[m][n];
        int dir = 0;
        int top = 0, down = m-1, left = 0, right = n-1;

        for(int i=0; i<m; i++){
            for(int j=00; j<n; j++){
                result[i][j] = -1;
            }
        }

        while(top<=down && left<=right){

            if(dir==0){
                for(int i=left; i<=right && head!=null; i++){
                    result[top][i] = head.val;
                    head = head.next; 
                }
                top++;
            }
            if(dir==1){
                for(int i=top; i<=down && head!=null; i++){
                    result[i][right] = head.val;
                    head = head.next;
                }
                right--;
            }
            if(dir==2){
                for(int i=right; i>=left && head!=null; i--){
                    result[down][i] = head.val;
                    head = head.next;
                }
                down--;
            }
            if(dir==3){
                for(int i=down; i>=top && head!=null; i--){
                    result[i][left] = head.val;
                    head = head.next;
                }
                left++;
            }
            
            dir++;
            if(dir==4){
                dir=0;
            }
        }
        
        
        return result;
    }

    public static void main(String[] args) {
        
    }
    
}
