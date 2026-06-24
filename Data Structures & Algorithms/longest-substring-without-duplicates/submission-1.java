class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> theset = new HashSet<>();
        int left = 0;
        int maxi = 0;
        for (int right = 0; right < s.length(); right ++){
            while (theset.contains(s.charAt(right))){
                theset.remove(s.charAt(left));
                left ++;
            }
            theset.add(s.charAt(right));
            maxi = Math.max(maxi, right - left + 1);
        }
        return maxi;
}
}
