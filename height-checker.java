class Solution {
    public int heightChecker(int[] heights) {
        
        // array that will get sorted
        int[] sorted = new int[heights.length];
        
        // making copy of heights array
        for(int i=0; i < heights.length; i++) {
            sorted[i] = heights[i];
        }
        
        // sorting it
        Arrays.sort(sorted);
        
        // counter for mismatches
        int counter = 0;
        
        // searching for mismatches
        for (int i = 0; i < heights.length; i++) {
            if(sorted[i] != heights[i]) {
                counter++;
            }
        }
        
        // returning mismatches
        return counter;
    }
}
