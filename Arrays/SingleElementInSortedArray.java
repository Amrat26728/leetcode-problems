package LeetCode.Arrays;

// problem
// https://leetcode.com/problems/single-element-in-a-sorted-array/

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,8,8};
        System.out.println(singleElement(arr));
    }

    ////// solution //////////
    private static int singleElement(int[] nums){
        int start = 0;
        int end = nums.length - 1;

        while (start < end){
            int mid = start + (end - start) / 2;
            if (mid % 2 == 0){
                if (nums[mid] == nums[mid + 1]){
                    start = mid + 2;
                }else{
                    end = mid;
                }
            }else{
                if (nums[mid] == nums[mid - 1]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return nums[start];
    }
}
