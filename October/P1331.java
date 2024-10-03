import java.util.Arrays;
import java.util.HashMap;

class P1331{

    public int[] arrayRankTransform(int[] arr) {

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> rMap = new HashMap<>();
        int rank = 1;

        for (int num : sortedArr) {
            if (!rMap.containsKey(num)) {
                rMap.put(num, rank);
                rank++;
            }
        }

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rMap.get(arr[i]);
        }
        
        return result;
    }
    
    public static void main(String arg[]){

    }
}