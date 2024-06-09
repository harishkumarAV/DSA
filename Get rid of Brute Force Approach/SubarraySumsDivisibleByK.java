// Subarray Sums Divisible by K
// Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

// A subarray is a contiguous part of an array.

 

// Example 1:

// Input: nums = [4,5,0,-2,-3,1], k = 5
// Output: 7
// Explanation: There are 7 subarrays with a sum divisible by k = 5:
// [4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
// Example 2:

// Input: nums = [5], k = 9
// Output: 0
 

// Constraints:

// 1 <= nums.length <= 3 * 104
// -104 <= nums[i] <= 104
// 2 <= k <= 104





class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int rem=0;
        int count =0;
        for(int num : nums){
            sum = sum + num;
            rem = sum % k;
            if(rem < 0){
                rem += k;
            }
            if(hm.containsKey(rem)){
                count += hm.get(rem);
            }
            hm.put(rem , hm.getOrDefault(rem , 0) +1);
        }
        return count;
    }
}





// Approach 
// I have used prefix sum approach here . ie.) if a prefix sum have the same remainder of another prefix sum .. then the subarray between them must be divisible by k.
// Lets explore more detail,

// Subarray Sum
// A subarray is a contiguous part of an array. The sum of a subarray is simply the sum of its elements.

// Using Prefix Sums to Find Subarrays
// To find subarrays that are divisible by  𝑘
// we use the concept of prefix sums and remainders (also called modular arithmetic).

// Remainder Property
// If two prefix sums have the same remainder when divided by 𝑘
// k, the subarray between these two prefix sums is divisible by 𝑘


  
// prefix_sum[j]−prefix_sum[i]=(prefix_sum[j]%k)−(prefix_sum[i]%k)=r−r=0


  
// HashMap for Efficiency
// To efficiently track the remainders and their frequencies, we use a hashmap. This allows us to quickly determine how many times a particular remainder has occurred, so we can count the valid subarrays efficiently.

// Detailed Step-by-Step Explanation
// Initialization:

// We initialize a hashmap (remainderFrequency) to store the frequency of each remainder.
// We add an initial entry {0: 1} to handle cases where a subarray from the start is divisible by 
// 𝑘
// k.
// Iterate Through the Array:

// We maintain a running sum (sum) as we iterate through the array.
// For each element in the array, we update the sum.
// We then compute the remainder of the sum when divided by 
// 𝑘
// k (remainder = sum % k).
// If the remainder is negative, we adjust it to be positive by adding 
// 𝑘
// k.
// Count Valid Subarrays:

// If the remainder has been seen before (exists in the hashmap), it means there are subarrays ending at the current index which are divisible by 
// 𝑘
// k. We add the frequency of this remainder to the count of valid subarrays.
// Update the hashmap with the new frequency of the current remainder.
// Return the Result:

// After iterating through the array, the count will hold the total number of subarrays whose sums are divisible by 
// 𝑘
// k.
// Example Walkthrough
// Let's walk through the example nums = [4, 5, 0, -2, -3, 1] with k = 5.

// Initialization:

// remainderFrequency = {0: 1}
// sum = 0
// count = 0
// Iterate through the array:

// Index 0:

// num = 4
// sum = 0 + 4 = 4
// remainder = 4 % 5 = 4
// remainderFrequency = {0: 1, 4: 1}
// No subarrays found yet, count = 0.
  
// Index 1:

// num = 5
// sum = 4 + 5 = 9
// remainder = 9 % 5 = 4
// remainderFrequency = {0: 1, 4: 2}
// remainder 4 seen before, means subarray [4, 5] is valid.
// count = 1.
  
// Index 2:

// num = 0
// sum = 9 + 0 = 9
// remainder = 9 % 5 = 4
// remainderFrequency = {0: 1, 4: 3}
// remainder 4 seen before, means subarrays [4, 5, 0] and [5, 0] are valid.
// count = 1 + 2 = 3.
  
// Index 3:

// num = -2
// sum = 9 - 2 = 7
// remainder = 7 % 5 = 2
// remainderFrequency = {0: 1, 4: 3, 2: 1}
// No subarrays found, count = 3.
  
// Index 4:

// num = -3
// sum = 7 - 3 = 4
// remainder = 4 % 5 = 4
// remainderFrequency = {0: 1, 4: 4, 2: 1}
// remainder 4 seen before, means subarrays [4, 5, 0, -2, -3], [5, 0, -2, -3], and [0, -2, -3] are valid.
// count = 3 + 3 = 6.
  
// Index 5:

// num = 1
// sum = 4 + 1 = 5
// remainder = 5 % 5 = 0
// remainderFrequency = {0: 2, 4: 4, 2: 1}
// remainder 0 seen before, means subarray [4, 5, 0, -2, -3, 1] is valid.
// count = 6 + 1 = 7.






