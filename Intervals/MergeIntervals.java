class Solution {
    public int[][] merge(int[][] intervals) {
        int n  = intervals.length;
        List<int[]> l = new ArrayList<>();
        Arrays.sort(intervals , (a,b)->Integer.compare(a[0],b[0]));
        int new_interval[] = intervals[0];
        l.add(new_interval);
        for(int[] interval : intervals){
            int pre_end = new_interval[1];
            int start = interval[0];
            int end = interval[1];
            if(pre_end >= start){
                new_interval[1] = Math.max(new_interval[1] , end);
            }else{
                new_interval = interval;
                l.add(new_interval);
            }
        }
        return l.toArray(new int[l.size()][]);

    }
}
