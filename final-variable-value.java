class Solution {
    public int finalValueAfterOperations(String[] operations) {
        
        // stores value of X
        int counter = 0;
        
        // goes through all strings and performs needed calculations
        for (int i = 0; i < operations.length; i++) {
            
            if (operations[i].equals("++X") || 
                operations[i].equals("X++")) {
                counter ++;
            }
            else {
                counter --;
            }
        }
        
        // returns final X value
        return counter;
    }
}
