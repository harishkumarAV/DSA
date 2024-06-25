class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points , (a,b)->Integer.compare(a[0] , b[0]));
        int n = points.length;
        int new_interval[] = points[0];
        List<int[]> l  = new ArrayList<>();
        l.add(new_interval);
        for(int[] interval : points){
            int prev_end = new_interval[1];
            int start = interval[0];
            int end = interval[1];
            if(prev_end >= start){
                new_interval[1] = Math.min(end , prev_end);
            }else{
                l.add(new_interval);
                new_interval = interval;
            }
        }
        return l.size();
    }
}
