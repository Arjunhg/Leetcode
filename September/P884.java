package Leetcode.September;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P884 {

    public String[] uncommonFromSentences(String s1, String s2) {
        
        Map<String, Integer> hm = new HashMap();

        String[] a = s1.split(" ");
        for(String s : a){
            hm.put(s, hm.getOrDefault(s,0)+1);
        }

        String[] b = s2.split(" ");
        for(String s : b){
            hm.put(s, hm.getOrDefault(s,0)+1);
        }

        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : hm.entrySet()){
            if(entry.getValue()==1){
                result.add(entry.getKey());
            }
        }

        return result.toArray(new String[0]);
    }
    
    public static void main(String[] args) {
        
    }
}