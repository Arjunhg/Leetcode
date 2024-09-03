package Leetcode.September;

public class P1945 {

    public int getLucky(String s, int k){

        // convert each letter in the given string to its correcponding number
        StringBuilder numStrBuilder = new StringBuilder();

        for(char ch: s.toCharArray()){
            numStrBuilder.append(ch - 'a' + 1);
        }

        String numStr = numStrBuilder.toString();

        // Transform string k times
        while(k-- > 0){
            int sum = 0;

            for(char ch: numStr.toCharArray()){
                sum += ch - '0';//convert each letter in the string to integer value.
            }

            numStr = Integer.toString(sum); //convert sum back to string for furthur iteration
        }

        return Integer.parseInt(numStr); //return final result
    }

    public static void main(String[] args) {

        P1945 obj = new P1945();
        
        // example
        int result = obj.getLucky("zbax", 2);

        System.out.println(result);
    }
    
}
