/* SOLUTION EXPLAINED:

    So since we can only use 1's and 0's, this tells us that mathematically,
    we need as many numbers as the highest number in the place values of n.
    What this means is that if the number is 23710, you get something like this:
    
    (1) |     0 0 1 0 0                     As you can see, since ours is a base 
    (2) |     0 0 1 0 0         10 number system, we are able to use only numbers
    (3) |     0 0 1 0 0         with ones and zeros to get 23710, and the amount 
    (4) |     0 0 1 0 0         of these numbers will invariably be equal to the 
    (5) |     0 0 1 0 0         highest place value digit, in this case 7. Knowing
    (6) |     0 0 1 0 0         this, all I need to write is a program that returns
    (7) |  +  1 1 1 1 0         the highest digit in n, and it will be correct!
        |     ---------
        |     2 3 7 1 0
*/

class Solution {
    public int minPartitions(String n) {
    
        int max = 0;
        
        for(int i = 0; i < n.length(); i++) {
        
            int digit = n.charAt(i) - '0';
            max = Math.max(digit, max);
        }
        
        return max;
    }
}
