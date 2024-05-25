// This approach uses HashMap and results in O(n) time complexity.
class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
        }
        for(int num : nums){
            if(hm.get(num) ==1 ){
                return num;
            }
        }
        return -1;
    }
}

// More Optimised Solution
// Time complexity: O(logn)

class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}
