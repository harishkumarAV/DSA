// Count Number of Nice Subarrays
// Given an array of integers nums and an integer k. A continuous subarray is called nice if there are k odd numbers on it.

// Return the number of nice sub-arrays.

 

// Example 1:

// Input: nums = [1,1,2,1,1], k = 3
// Output: 2
// Explanation: The only sub-arrays with 3 odd numbers are [1,1,2,1] and [1,2,1,1].
// Example 2:

// Input: nums = [2,4,6], k = 1
// Output: 0
// Explanation: There is no odd numbers in the array.
// Example 3:

// Input: nums = [2,2,2,1,2,2,1,2,2,2], k = 2
// Output: 16

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return find(nums , nums.length  , k) - find(nums , nums.length , k-1);
    }
    public static int find(int nums[] , int n ,int k){
        int ans =0;
        for(int i=0,j=0;j<n;j++){
            if(nums[j] % 2 ==1){
                k--;
            }
            while(k<0){
                if(nums[i] %2 ==1){
                    k++;
                }
                i++;
            }
            ans += j-i+1;
        }
        return ans;
    }
}
