class Solution {
    public int reverse(int x) {
        
        // Variable that I will build the reversed number on in string form.
        String strbuilder = "";
        
        // Variable tracking the length of the reversed string as it is built.
        int length = 0;
        
        // Variable where the final reversed x will be stored and returned.
        int final_num = 0;
        
        // Variable that holds the length of the inputted string
        int strlength = String.valueOf(x).length();
        
        // counter variable to track the first iteration of the while loop.
        int counter = 0;
        
        // while loop that recursively builds the string in reverse.
        while(length != strlength) {
            
            // if x is a single digit number:
            if ((x % 10) == x) {
                
                /* if x is a single digit number on first iteration, just add
                x to strbuilder. */
                if (counter == 0) {
                    counter = 1;
                    length ++;
                    strbuilder = strbuilder + x;
                    x = x/10;
                }
                
                /* if its not the first iteration, then it is the last digit being
                added to strbuilder, so only do it if it isn't 0. */
                else {
                    if (x != 0) {
                        length ++;
                        strbuilder = strbuilder + Math.abs(x);
                        x = x/10;
                    }
                    else {
                        length ++;
                    }
                }
            }
            
            // if x is not a single digit number:
            else {
                
                // if it is the first iteration:
                if (counter == 0) {
                    
                    // if (x % 10) ended with 0 and was negative, print only - sign.
                    if (x % 10 == 0 && x < 0) {
                        counter = 1;
                        length ++;
                        strbuilder = strbuilder + "-";
                        x = x/10;
                    }
                    
                    //otherwise, proceed as normal.
                    else {
                        counter = 1;
                        length ++;
                        strbuilder = strbuilder + (x % 10);
                        x = x/10;
                    }
                }
                
                /* else, if (x % 10) is not the first iteration or a single digit 
                number on that iteration, proceed as normal. */
                
                else {
                    length ++;
                    strbuilder = strbuilder + Math.abs((x % 10));
                    x = x/10;
                }
            }
        }
        
        /* Statement that throws exception if the reversed integer goes outside the
        signed 32-bit integer range, returning 0 in that case. */
        try {
            final_num = Integer.parseInt(strbuilder);
        }
        catch(Exception e) {
            return 0;
        }
        
        // final return statement.
        return final_num;
    }
}
