class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length;
        int m=mat[0].length;
        HashMap<Integer,PriorityQueue<Integer>> d = new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                d.putIfAbsent(i-j, new PriorityQueue<>());
                d.get(i-j).add(mat[i][j]);
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = d.get(i-j).poll();
            }
        }
        return mat;
    }
}
