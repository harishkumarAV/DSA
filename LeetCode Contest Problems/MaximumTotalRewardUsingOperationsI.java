import java.util.Arrays;

class Solution {
    public int maxTotalReward(int[] rewardValues) {
        Arrays.sort(rewardValues);
        Set<Integer> ans = new HashSet<>();
        ans.add(0);
        for (int r : rewardValues) {
            Set<Integer> newRewards = new HashSet<>();
            for (int x : ans) {
                if(r>x){
                    newRewards.add(x + r);
                }
            }
            ans.addAll(newRewards);
        }
        return Collections.max(ans);
    }
}
