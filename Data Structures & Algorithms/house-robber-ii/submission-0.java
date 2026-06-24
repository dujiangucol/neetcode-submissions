class Solution {
    public int rob(int[] nums) {
        return Math.max(nums[0], Math.max(helper(Arrays.copyOfRange(nums,1, nums.length)), helper(Arrays.copyOfRange(nums,0, nums.length - 1))));
    }

    private int helper(int[] nums){
        int prev = 0;
        int cur = 0;

        for (int i :nums){
            int temp = Math.max(prev+i, cur);
            prev = cur;
            cur = temp;
        }

        return cur;
    }
}
