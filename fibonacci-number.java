class Solution {
    public int fib(int n) {
        
        // edge case: if n = 0, return 0.
        if (n == 0) {
            return 0;
        }
        
        // base case for recursion: when n = 1, return 1.
        else if (n == 1) {
            return 1;
        }
        
        // recursive case: return fib(n - 1) - fib(n - 2).
        else {
            return ( fib(n - 1) + fib(n - 2) );
        }
    }
}
