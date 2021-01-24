class Solution {
    public boolean isPalindrome(int x) {
        
        // convert integer x to String number
        String number = Integer.toString(x);
        
        // Initializing variable to hold reversed number
        String reversed = "";
        
        // loop to reverse string
        for (int i = number.length() - 1; i >= 0; i--) {
            reversed = reversed + number.charAt(i);
        }
        
        /* compares reversed and original number and returns 
        true or false depending on outcome */
        return number.equals(reversed);
    }
}
