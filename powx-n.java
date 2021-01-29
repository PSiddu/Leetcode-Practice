class Solution {
    public double myPow(double x, int n) {
        
        if (x == 1 || n == 0) {
            return 1;
        }
        else if (x == -1 && n % 2 == 0) {
            return -x;
        }
        else if (x == -1 && n % 2 == 1) {
            return x;
        }
        else if (n == Integer.MIN_VALUE) {
            return 0;
        }
        else if (n < 0) {
            return (1/helperPow(x,-n));
        }
        else {
            return helperPow(x, n);
        }
    }
    
    public double helperPow(double x, int n) {
        
        double placeholder = x;
        
        while (n > 1) {
            placeholder = placeholder * x;
            n--;
        }
        
        return placeholder;
    }
}
