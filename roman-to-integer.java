class Solution {
    public int romanToInt(String s) {
        
        // creating a hashmap to store the Roman Numerals that are being worked with
        HashMap<Character, Integer> numerals = new HashMap<Character, Integer>();
        
        // the final return value will accumalate in this variable
        int total = 0;
        
        // putting the Roman Numerals in numerals
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);
        
        // traversing the input string that contains the numeral to be converted
        for (int i = 0; i < s.length(); i++) {
            
            // accounting for the 6 instances where subtraction is used:
            
            if (i != 0 && s.charAt(i) == 'M' && s.charAt(i-1) == 'C') {
                total = total + 800;
            }
            else if (i != 0 && s.charAt(i) == 'D' && s.charAt(i-1) == 'C') {
                total = total + 300;
            }
            else if (i != 0 && s.charAt(i) == 'C' && s.charAt(i-1) == 'X') {
                total = total + 80;
            }
            else if (i != 0 && s.charAt(i) == 'L' && s.charAt(i-1) == 'X') {
                total = total + 30;
            }
            else if (i != 0 && s.charAt(i) == 'X' && s.charAt(i-1) == 'I') {
                total = total + 8;
            }
            else if (i != 0 && s.charAt(i) == 'V' && s.charAt(i-1) == 'I') {
                total = total + 3;
            }
            
            /* if the instance does not entail subtraction, simply look up the char
            of s in the hashmap, and return its associated value.*/
            else {
                total = total + numerals.get(s.charAt(i));
            }
        }
        
        // now that the conversion has accumalated in total as planned, return total
        return total;
    }
}
