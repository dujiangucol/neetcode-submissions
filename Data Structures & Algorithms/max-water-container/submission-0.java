class Solution {
    public int maxArea(int[] heights) {
        int max = 0;

        int i = 0;
        int j = heights.length -1;
        int vol = 0;
        while (i < j){
            vol = heights[j] * (j-i);
            if (heights[i] != heights[j]){
                int height = Math.min(heights[i], heights[j]);
                vol = height * (j-i);
            }
            
            
            max = Math.max(max, vol);

            if (heights[i]< heights[j]){
                i ++;
            }
            else{
                j--;
            }
        }
        
        return max;
        } 
         
  
}

