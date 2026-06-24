class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>themap = new HashSet<>();

        for (int i: nums){
            themap.add(i);
        }
        int ans = 0;
        for ( int j:nums){
            if (! themap.contains(j-1)){
                int length = 1;
                while(themap.contains(length + j)){
                    length ++;
                    ans = Math.max(ans, length);
                }
                ans = Math.max(ans, length);
                
            }
        }
        return ans;

    }
}
