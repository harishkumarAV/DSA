class Solution {
    public long maximumHappinessSum(int[] Happiness, int k) {
        Arrays.sort(Happiness);
        Queue<Integer> queue = new LinkedList<>();
        for(int i=Happiness.length-1;i>=0;i--){
            queue.offer(Happiness[i]);
        }
        int i=0;
        long sum=0;
        while(k>0){
            sum += Math.max(queue.poll() - i , 0);
            k--;
            i++;
        }
        return sum;
    }
}
