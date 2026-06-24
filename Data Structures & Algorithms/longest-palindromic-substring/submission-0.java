class Solution {
    public String longestPalindrome(String s) {
        String res = "";
        int reslen = 0;

        for (int i =0; i < s.length(); i++){

            // ood length

            int l = i;
            int r = i;
            while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > reslen){
                    reslen = r- l + 1;
                    res = s.substring(l, r+1);
                }
                l--;
                r ++;
            }

            l = i;
            r = i+1;
            while(l >=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if(r - l + 1 > reslen){
                    reslen = r- l + 1;
                    res = s.substring(l, r+1);
                }
                l--;
                r ++;
            }
        }
        return res;
    }
}
