class Solution {
    private int rank(HashMap<Integer,Integer> hm , int a){
        if(hm.containsKey(a)){
            return hm.get(a);
        }
        return hm.size();
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i =0;i<arr2.length;i++){
            hm.put(arr2[i] , i);
        }
        List<Integer> l = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        l.sort(new Comparator<Integer>(){
            public int compare(Integer x,Integer y){
                int rank_A = rank(hm , x);
                int rank_B = rank(hm , y);
                return rank_A == rank_B ? x.compareTo(y) : Integer.compare(rank_A , rank_B);
            }
        });
        return l.stream().mapToInt(Integer::intValue).toArray();
    }
}
