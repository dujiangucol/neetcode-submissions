class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int result = 0;
        int max= 0;
        int i = 0;
        for (int j =0; j < s.length();j++){
            char ar = s.charAt(j);
            map.put(ar, map.getOrDefault(ar,0)+1);
            max = Math.max(max, map.get(ar));

            if ( j-i +1 - max > k ){
                char jchar = s.charAt(i);
                map.put(jchar, map.getOrDefault(jchar,0) -1);
                i ++;
            }
            result = Math.max(result, j - i +1);
        }
        return result;
    }
}
