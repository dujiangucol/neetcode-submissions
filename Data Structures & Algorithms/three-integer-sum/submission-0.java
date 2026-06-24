class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);  // Sort the array first
        List<List<Integer>> ans = new ArrayList<>();  // List to store the triplets

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                break;  // If the current number is greater than 0, break the loop
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;  // Skip duplicates for the current number
            }

            int l = i + 1;  // Left pointer
            int r = nums.length - 1;  // Right pointer

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;  // Move the right pointer left if the sum is too large
                } else if (sum < 0) {
                    l++;  // Move the left pointer right if the sum is too small
                } else {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));  // Add the valid triplet to the answer
                    l++;
                    r--;

                    // Skip duplicates for the left pointer
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }

                    // Skip duplicates for the right pointer
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }
        return ans;  // Return the list of triplets
    }
}

