package Leetcode.September;

public class P1310 {

        // TC: O(n^2)
        public int[] xorQueries(int[] arr, int[][] queries) {
            
            int m = queries.length;
            int[] result = new int[m];
    
            for(int i=0; i<m; i++){
                int min = Math.min(queries[i][0], queries[i][1]);
                int max = Math.max(queries[i][0], queries[i][1]);
    
                for(int j=min; j<=max; j++){
                    result[i] = result[i]^arr[j];
                }
            }
            return result;
        }

    public static void main(String[] args) {
        
    }
    
}
