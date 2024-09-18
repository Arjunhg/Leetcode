package Leetcode.September;

import java.util.Arrays;
import java.util.Comparator;

public class P179 {
    
    public String largestNumber(int[] nums) {
        
        Integer[] n = new Integer[nums.length];
        for(int i=0; i<nums.length; i++){
            n[i] = nums[i];
        }

        Arrays.sort(n,  new Comparator<Integer>(){

            public int compare(Integer a, Integer b){
                String s1 = a.toString();
                String s2 = b.toString();

                return (s2+s1).compareTo(s1+s2);
            }
        });

        if(n[0]==0){
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for(int num : n){
            result.append(num);
        }
        return result.toString();
    }
    
    public static void main(String[] args) {
        
    }
}
