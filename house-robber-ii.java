class Solution {
    public int rob(int[] nums) {

        int n = nums.length;
        
        int[] dp = new int[n];

        // base cases: if only 1 house, rob it, if two houses, rob the
        //   with more money.
        if (n == 1) {
            return nums[0];
        }
        if( n == 2) {
            return Math.max(nums[0], nums[1]);
        }

        // using same method as house robber 1, except since house 1 and n
        //   are together, we consider the case where we break the circle
        //   at n (by not robbing it), and looking at only houses 1 to n-1,
        //   as well as the case where we breaking the circle at 1, and
        //   looking at only houses 2 to n. Since these are mutually 
        //   exclusive, whichever set of houses yields the highest 
        //   possible total money robbed will be our answer.

        // CASE: houses 1 to n-1:

        // max value of first house only subproblem:
        //   trivially just the value of first house
        dp[0] = nums[0];
        // max value of up to second house only subproblem:
        //   trivially just the highest value between 1rst and 2nd house.
        dp[1] = Math.max(nums[0], nums[1]);

        // loop with recurrence relation
        for(int i = 2; i < n-1; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }

        // getting max robbery
        int tmpmax = -1;
        for(int j = 0; j < n-1; j++) {
            if (dp[j] > tmpmax) {
                tmpmax = dp[j];
            }
        }

        // CASE: same logic, with houses 2 to n.
        dp[1] = nums[1];
        dp[2] = Math.max(nums[1], nums[2]);

        for(int i = 3; i < n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        int max = -1;
        for(int j = 1; j < n; j++) {
            if (dp[j] > max) {
                max = dp[j];
            }
        }

        // return the max of the two sets of houses
        return Math.max(tmpmax, max);
    }
}
