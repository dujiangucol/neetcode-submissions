class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniques = new HashSet<Integer>();
        for (int i = 0 ;i<nums.length; i ++){
            if (uniques.contains(nums[i])){
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;
    }
}
