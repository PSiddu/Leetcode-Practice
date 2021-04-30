class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // final array
        int[] finarr = new int[2];
        
        // hashmap declaration
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        
        // putting into hashmap... the keys are the numbers, and the values are the indexes of the numbers
        for (int i = 0; i < nums.length; i++) {
            numbers.put(nums[i], i);
        }
        // searching for two numbers in nums that add up to target
        for (int i = 0; i < nums.length; i++) {
            
            // the second number that should add up to target
            int x = target - nums[i];
                
            // if the number exists, and the index of that number is not the same as the index of the other,
                if (numbers.containsKey(x) && numbers.get(x) != i) {
                    // add the indices of the two numbers into the return array
                    finarr[0] = i;
                    finarr[1] = numbers.get(x);
                    
                    //returning finarr
                    return finarr;
                }
        }
        // specs say that there must be atleast one solution, but if there is no solution, null is returned
        return null;
    }
}
