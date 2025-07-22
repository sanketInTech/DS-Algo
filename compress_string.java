package LeetCode;

// public class compress_string {
//     public static void main(String[] args) {
//         char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
//         System.out.println(compress(chars));
//     }
//     static int compress(char[] chars) {
//         int idx = 0; // index to insert characters
//         int i = 0;   // pointer for traversal

//         while (i < chars.length) {
//             char ch = chars[i]; // Current character
//             int count = 0;
            
//             // Count occurrences of chars[i]
//             while (i < chars.length && chars[i] == ch) {
//                 count++;
//                 i++; // Move to the next character
//             }
            
//             // Store the character
//             chars[idx++] = ch;

//             // If count > 1, store the count as well
//             if (count > 1) {
//                 for (char digit : String.valueOf(count).toCharArray()) {
//                     chars[idx++] = digit;
//                 }
//             }
//         }
//         return idx; // Return the new length of compressed array
//     }    
// }

public class compress_string {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        System.out.println(compress(chars));
    }
    static int compress(char[] chars) {
        int idx = 0;
        int i = 0;
        while(i < chars.length){
            char ch = chars[i];
            int count = 0;

            while(i < chars.length && chars[i] == ch){
                count++;
                i++;
            }

            chars[idx++] = ch;
            if(count > 1){
                for(char digit : String.valueOf(count).toCharArray())
                    chars[idx++] = digit;
            }
        }
        return idx;
    }
}
