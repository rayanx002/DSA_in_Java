/*
 * ============================================================
 * LeetCode #1 - Two Sum
 *
 * Difficulty: Easy
 * Topic: Array
 *
 * Problem:
 * Given an integer array nums and an integer target,
 * return the indices of the two numbers such that they
 * add up to target.
 *
 * Approach:
 * Brute Force
 *
 * We check every possible pair of elements using
 * two nested loops.
 *
 * For each nums[i], we look for a nums[j] such that:
 *
 *      nums[i] + nums[j] = target
 *
 * Rearranging:
 *
 *      nums[j] = target - nums[i]
 *
 * Since j starts from i + 1, we never use the same
 * element twice and we avoid checking the same pair
 * again.
 *
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 *
 * ============================================================
 */

public class LC0001_TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        System.out.println(
            "Indices: [" + result[0] + ", " + result[1] + "]"
        );
    }
}