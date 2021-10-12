class Solution {
    public String defangIPaddr(String address) {
        
        // converting address to char array to make easily
        //   manipulatable.
        char[] addressArr = address.toCharArray();
        
        // length variable for final retVal
        int len = addressArr.length;
        
        // counter variable to go through addressArr
        int j = 0;
        
        // loop that allocates needed length for final retVal
        for (int i = 0; i < addressArr.length; i++) {
            if (addressArr[i] == '.') {
                len = len + 2;
            }
        }
        
        // initializing return value in form of char array
        char[] retVal = new char[len];
        
        // iterating through addressArr, adding square brackets
        //   around any detected periods.
        for (int i = 0; i < len; i++) {
            
            if (addressArr[j] != '.') {
                retVal[i] = addressArr[j];
                j++;
            }
            else {
                retVal[i] = '[';
                retVal[i+1] = '.';
                retVal[i+2] = ']';
                i = i + 2;
                j++;
            }
        }
        
        // returning retVal in string form
        return String.valueOf(retVal);
    }
}
