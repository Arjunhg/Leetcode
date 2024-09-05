package Leetcode.September;

public class P2028 {

    public int[] missingRolls(int[] rolls, int mean, int n) {

        int m = rolls.length;
        int totalSum = mean * (m + n);

        int obsSum = 0;
        for(int i : rolls){
            obsSum += i;
        }

        int missingSum = totalSum - obsSum; //suppose 12
        // have to destribue this missing sum among n rolls such that each roll value is within 1<=n<=6

        // case when its not possible to destribute missing sum
        // check if missing sum less than lowest value or greater than greatest value
        if(missingSum < n || missingSum > 6*n){
            return new int[]{};
        }

        // Destributing the missing sum
        int[] result = new int[n];
        int avg = missingSum / n;
        int remainder = missingSum%n;

        for(int i=0; i<n; i++){
            result[i] = avg + (i < remainder ? 1 : 0 );
        }

        return result;
    }
    
    public static void main(String[] args){
        
    }
}
