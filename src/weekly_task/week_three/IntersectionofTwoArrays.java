/*
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
 */


class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums1){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i: nums2){
            if(map.containsKey(i)){
                if(map.get(i)>1){
                    map.put(i, map.get(i)-1);
                }else{
                    map.remove(i);
                }
                list.add(i);
            }
        }
        int[] res = new int[list.size()];

        res = list.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }
}