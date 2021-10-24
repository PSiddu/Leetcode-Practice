public class Codec {
    
    // creating a global hash-map to hold the short and long URL pairs together.    
    HashMap<String, String> URLs = new HashMap<String, String>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        // if the url with current generated code exists in the map,
        //   then that will be saved in this variable.
        boolean exists = true;
        // Note: we know that all codes will be unique since we clear the
        //   HashMap upon each decode, but in the case where the client wants
        //   the encoded URL to always be the same for a given URL, you would
        //   need this functionality.
        
        
        // initializing append code, as well as encoded string to be inserted
        double code = 0.0;
        String insert = "";
        
        // loop to keep generating code until guaranteed that it is unique
        while (exists) {
            
            // generating a random code (choice of 5 is arbitrary)
            code = Math.random() * 5;
            
            // appending it to encoded URL that will be inserted in the map
            insert = "http://tinyurl.com/" + code;
            
            // updating exists with whether the code has already been generated
            //   (low chance but just making sure) and added to the map
            exists = URLs.containsKey(insert);
            
        }
        
        // once the loop is over, the created link can be added to the hashmap
        //   as the key, with the long URL as the value.
        URLs.put(insert, longUrl);
        
        // returning the encoded URL
        return insert;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        
        // Because of the HashMap functionality initialized in the last method,
        //   this one becomes simple. RetVal retrieves the long URL via the given
        //   short URL within the HashMap.
        String retval = URLs.get(shortUrl);
        
        // Now, if you want a long URl to always have the same encoded URL, you would
        //   not have this .clear. However, for the purposes of this problem, we want
        //   to save space and time since we know it will just get immediately decoded.
        //   Thus, clear the HashMap.
        URLs.clear();
        
        // return retval
        return retval;
        
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
