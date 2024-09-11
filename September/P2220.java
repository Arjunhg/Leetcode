package Leetcode.September;

public class P2220 {

    public int minBitFlips(int start, int goal) {
        
        int num = start^goal;

        int count = 0;
        while(num!=0){
            count += num & 1;
            num = num>>1;
        }

        return count;
    }

    public static void main(String[] args) {
        
    }
    
}
