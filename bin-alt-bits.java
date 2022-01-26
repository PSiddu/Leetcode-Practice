class Solution {
    public boolean hasAlternatingBits(int n) {
        
        // will hold the binary string
        String binary = "";
        
        // will hold quotient of integer division
        int q = 0;
        
        // will hold remainder
        int r = 0;
        
        // until n becomes 0
        while (n != 0) {
            
            // divide n by 2
            q = n / 2;
            // get the remainder of this
            r = n % 2;
            
            // add the remainder as a binary bit to the string
            binary += String.valueOf(r);
            
            // reassign n
            n = q;
        }
        
        // checking the binary form of n for alternating bits
        for(int i = 1; i < binary.length(); i++) {
            
            if( binary.charAt(i) == binary.charAt(i-1)) {
                
                // there are some non-alternating bits
                return false;
            }
        }
        
        // there are only alternating bits
        return true;
    }
}
