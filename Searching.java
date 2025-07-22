package LeetCode;

/* 
public class Searching {
    public static void main(String[] args) {
       int[] nums = {2,3,4};
       int target = 6;
       System.out.println(Arrays.toString(twoSum(nums, target)));

    }
    static int[] twoSum(int[] numbers, int target) {
        // Linear Search 
        for(int i=0;i<numbers.length;i++){
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[i] + numbers[j] == target && i!=j){
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
*/
// Two Pointer Method -- start and end
/* 
public class Searching {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;

        while(start<end){
            if(nums[start] + nums[end] == target){
                return new int[]{start+1,end+1};
            }
            else if(nums[start] + nums[end] < target){
                start++;
            }
            else if(nums[start] + nums[end] > target){
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
*/
// Guess Number Higher or lower

// Two Pointer Method
// Med Level Que..
//  [1,1,2,3,3,4,4,8,8]
// 3,3,7,7,10,11,11
// public class Searching{
//     public static void main(String[] args) {
//         int [] nums = {3,3,7,7,10,10,11};
//         System.out.println(singleElement(nums));
//     }
//     static int singleElement(int[] nums){
//         int n = nums.length;
//         int start = 0;
//         int end = n-1;
//         while(start<=end-2){
//             if(nums[start] == nums[start+1]){
//                 start += 2;
//             }
//             else{
//                 return nums[start];
//             }
//         }
//         return nums[end];
//     }
// }

// // 
// public class Searching{
//     public static void main(String[] args) {
//         int[] nums = {7,6,4,3,1};
//         System.out.println(maxProfit(nums));
//     }
//     static int maxProfit(int[] prices) {
//         int minI = 0;
//         for(int i=0;i<prices.length;i++){
//             if(prices[minI] > prices[i]){
//                 minI = i;
//             }
//         }
//         int maxI = minI;
//         for(int j=minI+1;j<prices.length;j++){
//             if(prices[maxI] < prices[j]){
//                 maxI = j;
//             }
//         }
//         if(maxI >=0 && maxI<prices.length-1  && minI >=0 && minI < prices.length-1){
//             return prices[maxI] - prices[minI];
//         } 
//         else{
//             return 0;
//         }
//     }
// }

// Always Debug Code to Understand it step by step\
// 121. Best Time to Buy and Sell Stock
// public class Searching{
//     public static void main(String[] args) {
//         int[] nums = {1,2};
//         System.out.println(maxProfit(nums));
//     }
//     static int maxProfit(int[] prices) {
//         int minPrice = Integer.MAX_VALUE;
//         int maxprice = 0;

//         for (int i = 0; i < prices.length; i++) {
//             if(prices[i] < minPrice){
//                 minPrice = prices[i];
//             }
//             else if(prices[i] - minPrice > maxprice){
//                 maxprice = prices[i] - minPrice;
//             }
//         }
//         return maxprice;
//     }
// }

// 
