class Solution {
    public boolean detectCapitalUse(String word) {
        
        // counter variables to track if the first char is capital,
        //   and if there exists a lowercase char in the whole word,
        //   and if there exists an uppercase char in the whole word.
        int first_char = 0;
        int lowercase_exists = 0;
        int uppercase_exists = 0;
        
        // condition to check if first char is a capital.
        if (word.charAt(0) >= 65 && word.charAt(0) <= 90) {
                first_char = 1;
        }
        
        // loop to traverse the word and check if it is NOT valid.
        for (int i = 0; i < word.length(); i++) {
            
            // if any lowercase char is found, updating counter.
            if (word.charAt(i) >= 97 && word.charAt(i) <= 122) {
                lowercase_exists = 1;
            }
            
            // if any non-first char uppercase char is found,
            //   updating counter.
            if (i != 0 && word.charAt(i) >= 65 && 
                     word.charAt(i) <= 90) {
                uppercase_exists = 1;
            }

            // if there is a capital letter found and the first char 
            //   is lowercase.
            if (i != 0 && word.charAt(i) >= 65 && 
                     word.charAt(i) <= 90 && (first_char == 0)) {
                return false;
            }
            
            // if there is a a capital letter found and there is 
            //   any other lowercase.
            else if (i != 0 && word.charAt(i) >= 65 && 
                     word.charAt(i) <= 90 && (lowercase_exists == 1)) {
                return false;
            }
            
            // if there is a lowercase letter found and there is a 
            //   non-first char uppercase in the word.
            else if (word.charAt(i) >= 97 && word.charAt(i) <= 122
                    && (uppercase_exists == 1)) {
                return false;
            }
        }
        
        // if none of the INVALID cases are true, then the word passes,
        //   and true is returned.
        return true;
    }
}
