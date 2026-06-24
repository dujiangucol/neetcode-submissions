class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer>themap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int tostore = nums[i];
            int numleft = target - nums[i];

            if (themap.containsKey(numleft)){
                return new int[]{themap.get(numleft), i};
            }
            themap.put(tostore,i);
        }
        return new int[] {};

    }
}
