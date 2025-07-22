package LeetCode;
// 268 missing number
// Using Sort Function
/*
public class Cyclesort {
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        // first sort array
        Arrays.sort(nums);
        // now traverse
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
 */
// using cycle sort
/* 
public class Cyclesort{
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] arr){
        int i = 0;
        while(i<arr.length){
            int index = arr[i];
            if(arr[i] < arr.length && arr[i] != arr[index]){
                swap(arr, i, index);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j){
                return j;
            }
        }
        return arr.length;
    }
    static void swap(int[] nums,int first ,int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
*/
// Find All Numbers Disapperaed In Array
/* 
public class Cyclesort{
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(findDisappearedNumbers(nums));
    }
    static  List<Integer> findDisappearedNumbers(int[] nums) {
        int i =0;
        ArrayList <Integer> list = new ArrayList<>();
        while(i<nums.length){
            int index = nums[i] -1;
            if(nums[index] != nums[i]){
                swap(nums, i, index);
            }
            else{
                i++;
            }
        }
        for(int j=1;j<=nums.length;j++){
            if(nums[j-1] != j){
                list.add(j);
            }
        }
        return list;
    }
    static void swap(int[] nums,int first ,int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
}
*/
// cyclic sort
 /*
public class Cyclesort{
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
    }
    static int findDuplicate(int[] nums) {
        int i = 0;
        while (i<nums.length) {
            int index = nums[i] - 1;
            if(nums[index] != nums[i]){
                swap(nums, i, index);
            }
            else{
                i++;
            }
        }
    //    for (int j = 0; j < nums.length; j++) {
    //     if(nums[j] != j+1){
    //         return nums[j];
    //     }
    //    }
    // return -1;

    return nums[nums.length-1];
       
    }
    static void swap(int[] nums,int first ,int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
*/
 
// 442. Find All Duplicates in an Array
/* 
class Cyclesort {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(findDuplicates(nums));
    }
    static List<Integer> findDuplicates(int[] nums) {
        ArrayList <Integer> list = new ArrayList<>();
        int i =0;
        while(i<nums.length){
            int index = nums[i] -1;
            if(nums[index] != nums[i]){
                swap(nums, i, index);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                list.add(nums[j]);
            }
        }
        return list;
    }
    static void swap(int[] nums,int first ,int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
*/
// 645. Set Mismatch
/* 
public class Cyclesort{
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int index = nums[i] -1;
            if(nums[index] != nums[i]){
                swap(nums, i, index);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] nums,int first ,int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
*/

// Hard Level question 
// 41. First Missing Positive
// Just Copy Paste Approach of missing number problem and make changes in it that's it
// best solution
 /*
public class Cyclesort{
    public static void main(String[] args) {
         int[] nums = {7,8,9,11,12};
        // int[] nums = {1,2,3,4};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            // index = value - 1

            int index = nums[i] - 1;

            // ignore all negative numbers and zeroes and swap only for +ve ones
            // condition if element at index is not equal to index+1 then swap it with it's 
            // right index
            if(nums[i] > 0 && nums[i] <= nums.length && nums[index] != nums[i]){
                swap(nums, i, index);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1){ // for eg. {7,8,9,11,12}
                // if nums[j] != j+1 at 0th index it should be one 
                return j+1; // j+1 = 0+1 = 1 return 1 
            }
        }
        return nums.length+1; // else return n+1 for eg.{1,2,3,4}
        // in this case all elements are present that's why n+1 = 4+1 = 5
    }
    static void swap(int[] nums,int first ,int second){

        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
*/
