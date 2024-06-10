class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n <= 1){
            return intervals;
        }

        Arrays.sort(intervals , (i1,i2) -> Integer.compare(i1[0] , i2[0]));
        List<int[]> list = new ArrayList<>();
        int new_intervals[] = intervals[0];
        list.add(new_intervals);

        for(int interval[] :intervals){
            int prev_end = new_intervals[1];
            int start = interval[0];
            int end = interval[1];
            if(start <= prev_end){
                new_intervals[1] = Math.max(prev_end , end);
            }else{
                new_intervals = interval;
                list.add(new_intervals);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
