/*
Input: nums = [4,1,2,1,2]
Output: 4
 */
class Solution {
    public int singleNumber(int[] nums) {

        int l = nums.length;

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0; i<l; i++) {
            Integer count = map.get(nums[i]);
            if (count == null) {
                count = 1;
            }
            else {
                count ++;
            }

            map.put(nums[i], count);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key) != 2) {
                return key;
            }
        }
        return -1;
    }
}