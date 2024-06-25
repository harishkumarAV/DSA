class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> l = new ArrayList<>();
        int n = intervals.length;
        for(int[] interval : intervals){
            if(interval[1] < newInterval[0]){
                l.add(interval);
            }else if(interval[0] > newInterval[1]){
                l.add(newInterval);
                newInterval = interval;
            }else{
                newInterval[0] = Math.min(interval[0] , newInterval[0]);
                newInterval[1] = Math.max(interval[1] , newInterval[1]);
            }
        }
        l.add(newInterval);
        return l.toArray(new int[l.size()][]);
    }
}
