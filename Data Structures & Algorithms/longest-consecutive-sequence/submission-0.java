class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num:nums){
            set.add(num);
        }
        int currlength = 0;
        for (int n:set){
            if (! set.contains(n-1)){
                int length = 1;

                while (set.contains(n+length)){
                    length ++;
                }
                 currlength= Math.max(length, currlength);
            }
           
        }
        return currlength;
    }
}
