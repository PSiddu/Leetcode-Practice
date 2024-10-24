class Solution {
    public int rob(int[] nums) {
        // doing the dp way
        int[] dp = new int[nums.length];
        
        // case where array is only length 1;
        if (nums.length == 1) {
            return nums[0];
        }

        // base case: at the point of seeing only the first house,
        //   the best thing to do is trivially just rob that house
        dp[0] = nums[0];

        // if there's a second house, then trivially, to maximize
        //   your loot, you rob the max between the first and second house
        dp[1] = Math.max(nums[0], nums[1]);

        // loop through rest of array now that base cases are covered
        for (int i = 2; i < nums.length; i++) {

            /* this is the part that's kind of hard to understand, basically, on the third one, you choose between the max of the previous subproblem (you dont rob this house so you can get the one next door), or if it is more worth it to rob this house, you add the 2nd last subproblem to this current one, since they are not next to each other. */
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        // now, simply pick out the max element out of the dp array.
        int max = -1;
        for (int j = 0; j < dp.length; j++) {
            if (dp[j] > max) {
                max = dp[j];
            }
        }
        return max;
    }
}
