/*
Example 1:

Input: nums = [1,2,3,1]
Output: true

Example 2:

Input: nums = [1,2,3,4]
Output: false

 */
class Solution {
    public boolean containsDuplicate(int[] nums) {

        boolean res= false;
        List<Integer> aList= Arrays.stream(nums).boxed().toList();
        Set<Integer> hSet = new HashSet<Integer>(aList);
        hSet.addAll(aList);

        if( aList.size() == hSet.size()){

            res=false;
        }else{
            res=true;
        }

        return res;
    }
}