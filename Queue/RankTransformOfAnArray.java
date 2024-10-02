class Value{
    int val;
    int index;
    public Value(int val , int index){
        this.val = val;
        this.index = index;
    }
}
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        PriorityQueue<Value> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        for(int i=0;i<arr.length;i++){
            pq.add(new Value(arr[i] , i));
        }
        int rank =0;
        int prev = Integer.MIN_VALUE;
        while(!pq.isEmpty()){
            Value temp = pq.poll();
            if(temp.val > prev){
                rank++;
            }
            arr[temp.index] = rank;
            prev = temp.val;
        }
        return arr;
    }
}
