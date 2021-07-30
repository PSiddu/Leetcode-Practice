class Solution {
    public boolean isSubsequence(String s, String t) {
        
        // saving the lengths of strings s and t to preserve runtime.
        int s_len = s.length();
        int t_len = t.length();
        
        // counter variable to traverse string s.
        int counter = 0;
        
        // loop to traverse string t and check the letters against
        //   string s.
        for (int i = 0; i < t_len; i++) {
            
            // once s has been fully traversed, the loop can terminate.
            if (counter == s_len) {
                break;
            }
            
            // add one to counter if there is a char match
            if (t.charAt(i) == s.charAt(counter)) {
                counter++;
            }
        }
        
        // if all chars in s were found in the right order in t,
        //   return true.
        if (counter == s_len) {
            return true;
        }
        
        // else, return false.
        return false;
    }
}
