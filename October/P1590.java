import java.util.HashMap;

public class P1590 {

    public int minSubarray(int[] nums, int p) {
        
        int n = nums.length;
        int sum = 0;

        for(int num : nums){
            sum = (sum+num)%p;
        }

        int target = (sum)%p;

        if(target==0) return 0;

        HashMap<Integer, Integer> mp = new HashMap();
        mp.put(0,-1);

        int curr = 0;
        int result = n;

        for(int j=0; j<n; j++){
            curr = (curr+nums[j])%p;

            int prev = (curr-target+p)%p;

            if(mp.containsKey(prev)){
                result = Math.min(result, j - mp.get(prev));
            }

            mp.put(curr, j);
        }

        return result == n ? -1 : result ;
    }
    
    public static void main(String[] args) {
        
    }
}
