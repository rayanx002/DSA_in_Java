/*
 * ============================================================
 * LeetCode #1480 - Running Sum of 1D Array
 *
 * Difficulty: Easy
 * Topic: Array, Prefix Sum
 *
 * Problem:
 * Given an array nums, return the running sum of nums.
 *
 * The running sum at index i is:
 *
 *     nums[0] + nums[1] + ... + nums[i]
 *
 * Example:
 *
 *     Input:  [1, 2, 3, 4]
 *     Output: [1, 3, 6, 10]
 *
 * Approach:
 * Create a result array.
 *
 * The first element is directly copied:
 *
 *     result[0] = nums[0]
 *
 * For every remaining element:
 *
 *     result[i] = nums[i] + result[i - 1]
 *
 * This means:
 *     Current running sum = Current value + Previous running sum
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 *
 * ============================================================
 */

public class LC1480_RunningSum1DArray {

    public static int[] runningSum(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        result[0] = nums[0];

        for (int i = 1; i < n; i++) {
            result[i] = nums[i] + result[i - 1];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] result = runningSum(nums);

        System.out.print("Running Sum: [");

        for (int i = 0; i < result.length; i++) {

            System.out.print(result[i]);

            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}