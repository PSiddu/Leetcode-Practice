class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        // putting arr into ascending order
        Arrays.sort(arr);
        
        // initializing final return value
        List<List<Integer>> pairs = new ArrayList<>();
        
        // first loop to find minDiff
        int minDiff = Integer.MAX_VALUE;
        
        for(int i = 1; i < arr.length; i++) {
            if (Math.abs((arr[i] - arr[i-1])) < minDiff) {  
                minDiff = Math.abs((arr[i] - arr[i-1]));
            }   
        }
        
        // now to add pairs into list
        for(int i = 1; i < arr.length; i++) {
            
            // finding the pairs and adding them
            if (Math.abs((arr[i] - arr[i-1])) == minDiff) {
                
                List<Integer> pair = new ArrayList<>();
                
                pair.add(Math.min(arr[i], arr[i-1]));
                pair.add(Math.max(arr[i], arr[i-1]));

                pairs.add(pair);
            }
        }
        
        // returning final list
        return pairs;
    }
}
