class Solution {
    public int[] getConcatenation(int[] nums) {
        
        // length of array
        int n = nums.length;
        
        // initializing new array
        int ans[] = new int[2*n];
        
        // loop where array is concatenated with itself        
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        
        // return concatenated array
        return ans;
    }
}
