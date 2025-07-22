package LeetCode;
/*
public class Permutation_in_Strings {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
    static boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        for(int i = 0; i < 26; i++)
            freq[i] = 0;
        for(int i = 0; i < s1.length(); i++)
            freq[s1.charAt(i) - 'a']++;
        
        int windSize = s1.length();
        for(int i = 0; i < s2.length(); i++){
            int windIdx = 0, idx = i;
            int windFreq[] = new int[26];
            for(int j = 0; j < 26; j++)
                windFreq[j] = 0;
            while(windIdx < windSize && idx < s2.length()){
                windFreq[s2.charAt(idx) - 'a']++;
                windIdx++; idx++;
            }
            if(isfreqSame(freq, windFreq))
                return true;
        }
        return false;
    }
    static boolean isfreqSame(int[] freq1, int[] freq2){
        for(int i = 0; i < 26; i++){
            if(freq1[i] != freq2[i])
                return false;
        }
        return true;
    }
}
 */
/*// Permutation in String O(n)
import java.util.Arrays;

public class Permutation_in_Strings {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
    static boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        
        int[] s1freq = new int[26];
        int[] s2freq = new int[26];

        for(int i = 0; i < 26; i++){
            s1freq[i] = 0;
            s2freq[i] = 0;
        }
        for(int i = 0; i < s1.length(); i++)
            s1freq[s1.charAt(i) - 'a']++;
        
        int windSize = s1.length();
        for(int i = 0; i < s2.length(); i++){
            s2freq[s2.charAt(i) - 'a']++;

            if(i >= windSize){
                s2freq[s2.charAt(i - windSize) - 'a']--;
            }

            if(Arrays.equals(s1freq, s2freq))
                return true;
        }
        return false;
    }
}
 */

