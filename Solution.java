package LeetCode;
//build an array ans of the same length where ans[i] = nums[nums[i]]
// for each 0 <= i < nums.length and return it.

/* 
import java.util.ArrayList;
import java.util.List;

public class Arrayss {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Step 1: Find the maximum number of candies any kid currently has
        int maxCandies = 0;
        for (int candy : candies) {
            if (candy > maxCandies) {
                maxCandies = candy;
            }
        }

        // Step 2: Create the result list and check if each kid can have the greatest number of candies
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            // If current candy count + extra candies is greater than or equal to max candies
            result.add(candy + extraCandies >= maxCandies);
        }

        // Step 3: Return the result list
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> result = kidsWithCandies(candies, extraCandies);

        // Output the result
        System.out.println(result);
    }
}
*/
// Number of good pairs 
/*
public class Arrayss{
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        System.out.println(numIdenticalPairs(nums));
    }
    static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i<j && nums[i] == nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
 */

// How Many Numbers are smaller than the current Numbers
/*
public class Arrayss{
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            int count = 0;
            for (int j = 0; j < ans.length; j++) {
                if(nums[j] < nums[i]){
                    count++;
                }
                ans[i] = count;
            }
        }
        return ans;
    }
}
 */

// Spiral Matrix
// public class Arrayss{
//     public static void main(String[] args) {
//         int[][] matrix = {{1, 2, 3},
//                           {4, 5, 6},
//                           {7, 8, 9}
//         };
//         System.out.println(spiralOrder(matrix));
//     }
//     static List<Integer> spiralOrder(int[][] matrix) {
//         ArrayList <Integer> list = new ArrayList<>();
//         for(int i = 0;i<matrix.length;i++){
//             for(int j = 0;j<matrix[i].length;j++){
//                 list.add(matrix[i][j]);
//             }
//         }
//             return list;
//     }
// }

// row start, column start, row end, column end 
// spiral order ---> learn 

// public class Arrayss{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();
//         boolean isPrime;
//         isPrime = true;
//         int i = 2;
//         if(num <= 1){
//             isPrime = false;
//         }
//         while(i <= num/2){
//             if (num % i == 0){
//                 isPrime = false;
//             }
//             i++;
//         }
//         if(isPrime){
//             System.out.println("isPrime");
//         }
//         else{
//             System.out.println("notprime");
//         }
//     }
// }


// Ceiling & floor of a number
/*
public class Arrayss{
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(Ceiling(nums, 15));
    }
    static int Ceiling(int[] nums, int target){
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                return nums[mid];
            }
        }
        return nums[end];
    }
}
 */

// // Lucas Sequence 
// public class Arrayss{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n, prev, curr, next;
//         n = sc.nextInt();
//         prev = 1;
//         curr = 3;
//         int i = 0;
//         while(i < n){
//             System.out.print(prev+" ");
//             next = prev + curr;
//             prev = curr;
//             curr = next;
//             i++;
//         }
//     }
// }

// public class Solution {
//     public static void main(String[] args) {
//         int nums[] = {5,4,-1,7,8};
//         System.out.println(maxSubArray(nums));
//     }
//     static int maxSubArray(int[] nums) {
//         // -2,1,-3,4,-1,2,1,-5,4
//         // -5, -3, -2, -1, 1, 2, 4, 4;
//         Arrays.sort(nums);
//         int n = nums.length;
//         int prevSum = 0, sum = nums[n - 1]; 
//         for(int i = n - 1; i > 0; i--){
//             if(nums[i] != nums[i - 1]){
//                 if(sum + nums[i - 1] > sum){
//                     prevSum = sum;
//                     sum += nums[i - 1];
//                 }
//             }
//         }
//         return sum;
//     }
// }

// All Possible Subarray
// public class Solution {
//     public static void main(String[] args) {
//         int nums[] = {1, 2, 3, 4, 5};
//         for(int i = 0; i < nums.length; i++){
//             for(int j = i; j < nums.length; j++){
//                 for(int k = i; k <= j; k++){
//                     System.out.print(nums[k]);
//                 }
//                 System.out.print(" ");
//             }
//             System.out.println();
//         }
//     }
//}

// Maximum Subarray Sum 
// Kadane's Algorithm

// public class Solution {
//     public static void main(String[] args) {
        
//     }
//     static int maxSubArray(int[] nums) {
//         int maxSum = Integer.MIN_VALUE;
//         int currSum = 0;
//         for(int i = 0; i < nums.length; i++){
//             currSum += nums[i];
//             maxSum = Integer.max(maxSum, currSum);

//             if(currSum < 0) 
//                 currSum = 0;
//         }   
//         return maxSum;
//     }
// }

// // Pow(x^n)
// public class Solution {
//     public static void main(String[] args) {
//         double x = 2.0;
//         int n = -2;
//         System.out.println(myPow(x, n));
//     }
//     static double myPow(double x, int n) {
//         if(n == 0)
//             return  1;
//         if(n > 0)   
//             return x * myPow(x, n - 1);
//         else 
//             return x / myPow(x, n + 1);
//     }
// }

// public class Solution {
//     public double myPow(double x, int n) {
//         return Math.pow(x, n);
//     }
// }

// Container with most water
/*
public class Solution {
    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
    static int maxArea(int[] height) {
        int prevArea = 0, currArea = 0, a = 0, b = 0;
        int s = 0;
        int e = height.length - 1;
        while(s < e){
            b = e - s;
            if(height[s] < height[e]){
                a = height[s];
                s++;
            }
            else{
                a = height[e];
                e--;
            }
            currArea = a * b;
            if(currArea > prevArea){
                prevArea = currArea;
            }
        }
        return prevArea;
    }
}
 */
/*
// 3Sum -> Medium Level Question 
public class Solution {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        // -1,0,1,2,-1,-4 
        for(int i = 0; i < nums.length - 2; i++){ // Traverse thorugh an array
            if(i > 0 && nums[i] == nums[i - 1]) continue; 
            int s = i + 1; // so that s never equls i
            int e = nums.length - 1;

            while(s < e){
                int sum = nums[i] + nums[s] + nums[e];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[s], nums[e]));

                    while(s < e && nums[s] == nums[s + 1]) s++;
                    while(s < e && nums[e] == nums[e - 1]) s--;
                    
                    s++;
                    e--;
                }
                else if(sum > 0)
                    e--;
                else
                    s++;
            }
        }
        return list;
    }
}
 */
// Valid Palindrome 
/*
public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
    static boolean isPalindrome(String s) {
       StringBuilder sb = new StringBuilder();
       for(char c : s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            sb.append(Character.toLowerCase(c));
        }
       }
       int l = 0;
       int h = sb.length() - 1;
       while(l < h){
        if(sb.charAt(l) != sb.charAt(h))
            return false;
        l++;
        h--;
    }
    return true;
    }
}
 */

// public class Solution {
//     public static void main(String[] args) {
//         String s = "I,love;DSA and Java";
//         StringBuilder sb = new StringBuilder();
//         String[] words = s.split("[,; ]+");
//         for(String word: words){
//             sb.append(word).append(" ");
//         }
//         System.out.println(sb.toString().trim());
//     }
// }

// 4 Sum 

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         List<List<Integer>> list = new ArrayList<>();
//         Arrays.sort(nums);
        
//         for(int i = 0; i < nums.length; i++) {
//             if(i > 0 && nums[i] == nums[i - 1]) continue; 

//             for(int j = i + 1; j < nums.length; j++) {
//                 if(j > i + 1 && nums[j] == nums[j - 1]) continue; 

//                 int p = j + 1, q = nums.length - 1;
                
//                 while(p < q) {
//                     long sum = (long)nums[i] + nums[j] + nums[p] + nums[q];
                    
//                     if(sum == target) {
//                         list.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
//                         p++;
//                         q--;

//                         while(p < q && nums[p] == nums[p - 1]) p++; 
//                         while(p < q && nums[q] == nums[q + 1]) q--; 
//                     } 
//                     else if(sum > target) {
//                         q--;
//                     } 
//                     else {
//                         p++;
//                     }
//                 }
//             }
//         }
//         return list;
//     }
// }


// public class Solution {
//     public static void main(String[] args) {
//         int[] nums = {1,2,3,0};
//         System.out.println(Arrays.toString(productExceptSelf(nums)));
//     }
//     static int[] productExceptSelf(int[] nums) {
//         int total_product = 1;
//         int product_without_zero  = 1;
//         int[] answer = new int[nums.length];
//         for(int i = 0; i < nums.length; i++){
//             total_product *= nums[i];
//             if(nums[i] == 0) continue;
//             product_without_zero *= nums[i];
//         }

//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] != 0){
//                 answer[i] = total_product / nums[i];
//             }
//             else{
//                 answer[i] = product_without_zero;
//             }
//         }
//         return answer;
//     }

// }

//238. Product of Array Except Self
// Brute Force Approach
// public class Solution {
//     public static void main(String[] args) {
//         int[] nums = {-1,1,0,-3,3};
//         System.out.println(Arrays.toString(productExceptSelf(nums)));
//     }   
//     static int[] productExceptSelf(int[] nums) {
//         int[] answer = new int[nums.length];
//         for(int i = 0; i < nums.length; i++){
//             int product = 1;
//             for(int j = 0; j < nums.length; j++){
//                 if(i != j)  
//                     product *= nums[j];
//             }
//             answer[i] = product;
//         }
//         return answer;
//     }
// }

// // Optimal Approach
// public class Solution {
//     public static void main(String[] args) {
//         int[] nums = {-1,1,0,-3,3};
//         System.out.println(Arrays.toString(productExceptSelf(nums)));
//     }
//     static int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] answer = new int[nums.length];

//         for(int i = 0; i < nums.length; i++)
//             answer[i] = 1;

//         for(int i = 1; i < n; i++)
//             answer[i] = answer[i - 1] * nums[i - 1];

//         int suffix = 1;
//         for(int i = n - 2; i >= 0; i--){
//             suffix *= nums[i + 1];
//             answer[i] *= suffix;
//         }
//         return answer;
//     }
// }


// public class Solution {
//     public static void main(String[] args) {
//         int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//         System.out.println(binarySearch(nums, 10, 0, nums.length - 1));
//     }
//     static int binarySearch(int[] nums, int target, int s, int e){
//         if(s > e)
//             return -1;
//         int mid = s + (e - s)/ 2;
//         if(nums[mid] < target)
//             return binarySearch(nums, target, mid + 1, e);
//         else if(nums[mid] > target)
//             return binarySearch(nums, target, s, mid - 1);
//         else
//             return mid;
//     }
// }

// public class Solution {
//     public static void main(String[] args) {
//         int[] nums = {4,5,6,7,0,1,2};
//         System.out.println(search(nums, 3));
//     }
//     static int search(int[] nums, int target) {
//         int s = 0;
//         int e = nums.length - 1;
//         while(s <= e){
//             int mid = s + (e - s)/2;
//             if(nums[mid] == target) return mid;
//             if(nums[s] <= nums[mid]){
//                 // left search space
//                 if(nums[s] <= target && target <= nums[mid]) e = mid - 1;
//                 else    s = mid + 1;
//             }
//             else{
//                 // right search space
//                 if(nums[mid] <= target && target <= nums[e])    s = mid + 1;
//                 else    e = mid - 1;
//             }
//         }
//         return -1;
//     }
// }

// Peak Index In A Sorted Array

// public class Solution {
//     public static void main(String[] args) {
//         int[] nums = {0,2,1,0};
//         System.out.println(peakIndexInMountainArray(nums));
//     }
//     static int peakIndexInMountainArray(int[] arr) {
//         int s = 1;
//         int e = arr.length - 2;
//         while(s <= e){
//             int mid = s + (e - s)/2;
//             if(arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
//                 return mid;
//             else if(arr[mid - 1] < arr[mid])
//                 s = mid + 1;
//             else    
//                 e = mid - 1;
//         }
//         return -1;
//     }
// }

// Allocation Problem O(n)
public class Solution {
    public static void main(String[] args) {
        int[] nums = {22, 23, 67};
        System.out.println(findPages(nums, 1));
    }
    static int findPages(int[] arr, int k) {
        // code here
        int sum = 0;
        // edge case
        if(k > arr.length)  
            return -1;
        for(int i = 0; i < arr.length; i++)
            sum += arr[i];
        int s = 0;
        int e = sum;

        while(s <= e){
            int mid = s + (e - s)/2;
            if(isValid(arr, k, mid))
                e = mid - 1;
            else    
                s = mid + 1;
        }
        return s;
    }
    static boolean isValid(int arr[], int k, int mid){
        int stu = 1, pages = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > mid)
                return false;
            if(pages + arr[i] <= mid)
                pages += arr[i];
            else{
                stu++;
                pages = arr[i];
            }
        }
        return stu <= k;
    }
}
