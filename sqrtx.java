class Solution {
    
    public int mySqrt(int x) {
        
        int counter = 0;
        int n = 0;
        
        while (counter == 0) {
            
            if (x == 0) {
                
                counter = counter + 1;
            }
            else if((Math.pow(n, 2) <= x) && (Math.pow((n+1),2) > x)) {
                
                counter = counter + 1;
            }
            else {
                
                n = n + 1;
            }
        }
        
        return n;
    }
}
