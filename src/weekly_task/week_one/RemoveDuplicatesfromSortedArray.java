/*
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {

        int i = 1;
        int j = 0;

        if (nums.length < 2)
            return nums.length;

        while (i < nums.length) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
            i++;
        }
        return j + 1;

    }
}
