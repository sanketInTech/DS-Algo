package LeetCode;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Permutation_inString {
//    public static void main(String[] args) {
//        String s = "abcd";
//        permutation("", s);
////        System.out.println(permutationsList("", "abc"));
//        System.out.println(permutationCount("", "abcd"));
//    }
//    static void permutation(String p, String up) {
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//        // recursive approach
//        // first character of up
//        char ch = up.charAt(0);
//        for (int i = 0; i <= p.length(); i++) {
//            String f = p.substring(0, i);
//            String s = p.substring(i);
//            permutation(f + ch + s, up.substring(1));
//        }
//    }
//    static List<String> permutationsList(String p, String up) {
//        if(up.isEmpty()){
//            List<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        ArrayList<String> res = new ArrayList<>();
//        char ch = up.charAt(0);
//        for (int i = 0; i <= p.length(); i++) {
//            String f = p.substring(0, i);
//            String s = p.substring(i);
//            res.addAll(permutationsList(f + ch + s, up.substring(1)));
//        }
//        return res;
//    }
//    static int permutationCount(String p, String up) {
//        if(up.isEmpty()){
//            return 1;
//        }
//        int count = 0;
//        // recursive approach
//        // first character of up
//        char ch = up.charAt(0);
//        for (int i = 0; i <= p.length(); i++) {
//            String f = p.substring(0, i);
//            String s = p.substring(i);
//            count += permutationCount(f + ch + s, up.substring(1));
//        }
//        return count;
//    }
//}


// logically try to understand and solve questions rather than just mugging things up
// and just copy-pasting, it's not helpful learn critical thinking
public class Permutation_inString {
    public static void main(String[] args) {
        String str = "abc";
        permute("", str);
    }
    // recursive approach
    static void permute(String p, String up){
        // base case
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        // main
        for(int i = 0; i <= p.length(); i++){
            // here equality holds and is crucial,otherwise it won't print anything
            // why ?
            char ch = up.charAt(0);
            String f = p.substring(0, i);
            String s = p.substring(i);
            permute(f + ch + s, up.substring(1));
        }
    }
}