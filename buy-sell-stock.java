class Solution {
    public int maxProfit(int[] prices) {

        // holds the lowest price encountered so far
        int min = Integer.MAX_VALUE;

        // holds the max difference between a price (as you
        //   iterate through an array) and the current minimum
        int max_difference = -1;

        // loop that iterates through prices array
        for(int i = 0; i < prices.length; i++) {
          
          // updates the min value
          if (prices[i] < min) {
            min = prices[i];
          }

          // calculates the difference between the current
          //   value at prices[i] and the current min
          int curr_diff = prices[i] - min;

          // compare curr_diff to max_difference
          if (curr_diff > max_difference) {
            max_difference = curr_diff;
          }
        }
        // return the max_difference (a.k.a the highest profit)
        return max_difference;
    }
}

