class Solution {
    public int maximumWealth(int[][] accounts) {
        
        // iterating through customer banks
        int j = 0;
        
        // variable to accumalate amount of customer wealth
        int counter = 0;
        
        // the max wealth encountered thus far will be stored here
        int max = 0;
        
        // loop that iterates through the customers
        for (int i = 0; i < accounts.length; i++) {
            
            // adding to customer wealth
            counter += accounts[i][j];
            
            // if all banks are searched for customer
            if (j == accounts[i].length - 1) {
                
                // if the customer wealth is the max encountered
                //   thus far, update max.
                if (counter > max) {
                    max = counter;
                }
                
                // in all cases, reset counter and j variables
                counter = 0;
                j = 0;
            }
            
            // else, continue iterating through current customer
            else {
                i--;
                j++;
            }
        }
        
        // after loop is complete, return the max wealth
        return max;
    }
}
