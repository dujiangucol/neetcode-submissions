class Solution {
    public boolean isValid(String s) {
        Stack<Character> sta = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        
        map.put(')','(');
        map.put('}', '{');
        map.put(']','[');

        for (int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);

            if (map.containsKey(c)){
                if (!sta.isEmpty() && map.get(c).equals(sta.peek())){
                    sta.pop();
                }
                else{
                    return false;
                }
            }
            else{
                sta.push(c);
            }
        }
        return sta.isEmpty();
    }
}
