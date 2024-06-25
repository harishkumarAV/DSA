class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> l = new ArrayList<>();
        if(nums.length == 0){
            return l;
        }
        Arrays.sort(nums);
        String start = nums[0]+"";
        String end ="";
        int count = 1;
        l.add(start+"");
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]+1){
                if(count == 1){
                    count++;
                    l.remove(l.size()-1);
                    start+="->";
                    end = nums[i]+"";
                }
                else{
                    l.remove(l.size()-1);
                    end = nums[i]+"";
                }
            }else{
                start=nums[i]+"";
                end="";
                count=1;
            }
            l.add(start+end);
        }
        return l;
    }
}
