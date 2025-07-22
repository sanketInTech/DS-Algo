package LeetCode;
//
// import java.lang.reflect.Array;
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.List;
//
// public class permutation_inArray {
//     public static void main(String[] args) {
//         int[] num = {3, 2, 1};
//         for(int[] arr: result(num)){
//             System.out.println(Arrays.toString(arr));
//         }
//     }
//     static List<int[]> result(int[] nums) {
//         List<int[]> res = new ArrayList<int[]>();
//         permute(nums, 0, res);
//         return res;
//     }
//     static void permute(int[] nums, int idx, List<int[]> res) {
//         if (idx == nums.length) {
//
//             res.add(nums.clone());
//             return;
//         }
//         for (int i = idx; i < nums.length; i++) {
//             swap(idx, i, nums); // idx -> ith choice
//             permute(nums, idx + 1, res); // recursion
//             swap(idx, i, nums); // backtracking step
//         }
//     }
//     static void swap(int f, int s, int[] nums){
//         int t = nums[f];
//         nums[f] = nums[s];
//         nums[s] = t;
//     }
// }

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//// permutations in array
//public class permutation_inArray {
//    public static void main(String[] args) {
//        int[] nums= {3, 2, 1};
//        System.out.println(result(nums));
//    }
//    static List<List<Integer>> result(int[] nums){
//        List<List<Integer>> list = new ArrayList<>();
//        permute(nums, 0, list);
//        return list;
//    }
//    static void permute(int[] nums, int idx, List<List<Integer>> res) {
//        if (idx == nums.length) {
//            List<Integer> list = new ArrayList<>();
//            for(int n: nums)
//                list.add(n);
//            res.add(list);
//            return;
//        }
//
//        // main body of code
//        for(int i = idx; i < nums.length; i++) {
//            // swaping
//            swap(idx, i , nums);
//            // recursion
//            permute(nums, idx + 1, res);
//            // backtraking
//            swap(idx, i , nums);
//        }
//    }
//    static void swap(int f, int s, int[] nums){
//        int t = nums[f];
//        nums[f] = nums[s];
//        nums[s] = t;
//    }
//}

// permutations in array
//
//public class permutation_inArray {
//    public static void main(String[] args) {
//        int[] nums= {3, 2, 1};
////        System.out.println(permute(nums));
////        permuations_array(nums, 0);
////        System.out.println(permuations_count(nums, 0));
//    }
//    static List<List<Integer>> permute(int[] nums) {
//        List<List<Integer>> res = new ArrayList<>();
//        permuations(nums, 0, res);
//        return res;
//    }
//    static void permuations(int[] nums, int idx, List<List<Integer>> res) {
//        if(idx == nums.length){
//            List<Integer> list = new ArrayList<>();
//            for(int n:nums){
//                list.add(n);
//            }
//            res.add(list);
//            return;
//        }
//
//        // loop through it
//        for(int i = idx; i < nums.length; i++){
//            // swaping
//            swap(nums, idx, i);
//            // recursively increment idx
//            permuations(nums, idx + 1, res);
//            // backtracking
//            swap(nums, idx, i);
//        }
//    }
//    static int permuations_count(int[] nums, int idx) {
//        if(idx == nums.length){
//            return 1;
//        }
//        int count = 0;
//        // loop through it
//        for(int i = idx; i < nums.length; i++){
//            // swaping
//            swap(nums, idx, i);
//            // recursively increment idx
//            count += permuations_count(nums, idx+1);
//            // backtracking
//            swap(nums, idx, i);
//        }
//        return count;
//    }
//    static void permuations_array(int[] nums, int idx) {
//        if(idx == nums.length){
//            System.out.print(Arrays.toString(nums) + " ");
//            return;
//        }
//        // loop through it
//        for(int i = idx; i < nums.length; i++){
//            // swaping
//            swap(nums, idx, i);
//            // recursively increment idx
//            permuations_array(nums, idx+1);
//            // backtracking
//            swap(nums, idx, i);
//        }
//    }
//    static void swap(int[] nums, int f, int s){
//        int t = nums[f];
//        nums[f] = nums[s];
//        nums[s] = t;
//    }
//}
/**/
    /*
public class permutation_inArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void nextPermutation(int[] nums) {
        int n = nums.length, piv = -1;
        // 1st step - find pivot
        for(int i = n - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]) {
                piv = i;
                break;
            }
        }
        // edge case
        if(piv == -1){
            Arrays.sort(nums);
            return;
        }
        // 2nd step - find rightmost element > pivot
        for(int i = n - 1; i > piv; i--){
            if(nums[i] > nums[piv]){
                swap(nums, piv, i);
                break;
            }
        }
        // 3rd step - reverse the elements after pivot
        int s = piv + 1;
        int e = n - 1;
        while(s <= e){
            swap(nums, s, e);
            s++;
            e--;
        }
    }
    static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
*/
