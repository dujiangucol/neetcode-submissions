class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int result = 0;
        int maxre = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++){
            /// put into the map
            char now = s.charAt(right);
            map.put(now, map.getOrDefault(now, 0)+1);

            maxre = Math.max(maxre, map.get(now));

            if(right - left + 1 - maxre > k){
                map.put(s.charAt(left), map.getOrDefault(s.charAt(left),0)-1);
                left ++;
            }
            
            result = Math.max(result, right - left +1);
        }
        return result;
    }
}
