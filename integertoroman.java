class Solution {
    public String intToRoman(int num) {
        
        // counter to tell us if whole number has been converted
        int counter = 0;
        //length of number
        int length = String.valueOf(num).length();
        
        // placeholder number that needs to be converted each iteration of the loop
        int placeholder = 0;
        
        // converted placeholder number to single digit number to be converted
        int singledigit = 0;
        
        // the amounts by which you mod or divide the number to get placeholder
        int tens = 10;
        int tens2 = 1;
        
        // string where numeral is built in reverse
        String buildingstr="";
        // final string where buildingstr is reversed
        String outstr="";
        
        /* strings that algorithmically serve the same purpose each iteration of the loop but 
        must be a differnt value each time. */
        String numeral="";
        String middle="";
        String last="";
        
        // loop runs until all base-10 places of the input number are converted
        while (counter != length) {
            
            //gives ones place, 10s place, 100s place, etc.
            placeholder = (num % tens);
            
            // placeholder conversion to one digit number
            singledigit = placeholder / (tens2);
            
            //if converting the first digit, use these numerals
            if (tens == 10) {
                numeral = ("I");
                middle=("V");
                last=("X");
            }
            // else if converting the 10s place, use these numerals
            else if (tens == 100) {
                numeral=("X");
                middle=("L");
                last=("C");
            }
            //else if converting the 100s place, use these numerals
            else if (tens == 1000) {
                numeral=("C");
                middle=("D");
                last=("M");
            }
            /* else if converting the 1000s place, use these numerals
            (Roman numerals only go between 1 <= num <= 3999) */
            else if (tens == 10000) {
                numeral=("M");
            }
            
            //deals with the case where there's a zero in this place
            if (singledigit == 0) {
                
                buildingstr = buildingstr + "";
            }
            // Deals with the first 3 cases (1 - 3)
            else if (singledigit <= 3) {
                
                for (int i = 0; i < singledigit; i++) {
                    buildingstr = buildingstr + numeral;
                }
            }
            // Deals with the fourth case (4)
            else if (singledigit == 4) {
                buildingstr = buildingstr + middle + numeral;
            }
            // Deals with the fifth case (5)
            else if (singledigit == 5) {
                buildingstr = buildingstr + middle;
            }
            // deals with next 3 cases (6 - 8)
            else if (singledigit <= 8) {

                for (int j = 0; j < singledigit-5; j++) {
                    buildingstr = buildingstr + numeral;
                }
                buildingstr = buildingstr + middle;
            }
            // deals with last case (9)
            else if (singledigit == 9) {
                buildingstr = buildingstr + last + numeral;
            }
            
            // update variables for next iteration
            tens = tens * 10;
            tens2 = tens2 * 10;
            counter ++;
        }
        
        //after loop is done, string is in roman numerals but reversed, so gotta unreverse it
        for (int i = buildingstr.length() - 1; i >= 0; i--) {
            outstr = outstr + buildingstr.charAt(i);
        }
        
        //returning final value
        return outstr;
    }
}
