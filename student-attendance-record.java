class Solution {
    public boolean checkRecord(String s) {
        
        // counter variables for "A" and "L" chars.
        int a = 0;
        int l = 0;
        
        // loop to traverse string s.
        for (int i = 0; i < s.length(); i++) {
            
            // adding 1 to a if there's an "A",
            //   and resetting l count.
            if (s.charAt(i) == 'A') {
                a++;
                l = 0;
            }
            
            // adding 1 to l if there's an "L".
            if (s.charAt(i) == 'L') {
                l++;
                
                // if there's been 3 consecutive "L" chars,
                //   then no award, returning false.
                if (l == 3) {
                    return false;
                }
            }
            
            // if no late, then reset l count.
            else {
                l = 0;
            }
            
            // if 2 absents found, then no award, returning false.
            if (a == 2) {
                return false;
            }
        }
        
        // if the "no award" cases were never hit, then the
        //   student qualified for the award and thus returning true.
        return true;
    }
}
