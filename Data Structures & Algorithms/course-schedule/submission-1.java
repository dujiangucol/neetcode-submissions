class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < numCourses; i++){
            map.put(i, new ArrayList<>());
        }

        for (int[] pair: prerequisites){
            map.get(pair[0]).add(pair[1]);
        }

        for (int c = 0; c < numCourses; c++){
            if (!dfs(c, map, set)){
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int c, HashMap<Integer, List<Integer>> map, HashSet<Integer> set){
        if (set.contains(c)){
            return false;
        }
        if (map.get(c).isEmpty()){
            return true;
        }

        set.add(c);
        for (int pre: map.get(c)){
            if (!dfs(pre, map, set)){
                return false;
            }
        }
        set.remove(c);
        return true;
    }
}
