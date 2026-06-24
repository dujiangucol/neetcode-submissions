class Solution {

    public String encode(List<String> strs) {
        StringBuilder ans = new StringBuilder();
        for (String str: strs){
            ans.append(str.length()).append("#").append(str);
        }
        return ans.toString();
    }

    public List<String> decode(String str) {
        List<String> answer = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j ++;
            }
            int length = Integer.valueOf(str.substring(i,j));
            i = j+1+length;
            answer.add(str.substring(j+1,i));
        }
        return answer;

    }
}
