package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Group_Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
    static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>map = new HashMap<>();
        for(String str : strs){
            char[] words = str.toCharArray();
            Arrays.sort(words);
            String sortedstring = new String(words);

            if(!map.containsKey(sortedstring))
                map.put(sortedstring, new ArrayList<>());

            map.get(sortedstring).add(str);
        }
        return new ArrayList<>(map.values()); 
        // return values of map
        // in the form of arraylist 
    }
}
