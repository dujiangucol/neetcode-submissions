class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {  // Ensure there are at least three elements to process
            if (nums[i] > 0) {
                break;  // Since the array is sorted, no need to check further if the first number is positive
            }
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;  // Skip duplicate values
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;  // Need a smaller sum, move the right pointer left
                } else if (sum < 0) {
                    l++;  // Need a larger sum, move the left pointer right
                } else {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));  // Found a triplet
                    l++;
                    r--;
                    // Move l and r to the next different numbers to avoid duplicate results
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }
        return res;
    }
}


