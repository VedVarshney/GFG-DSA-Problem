class Solution {
    public String largestEven(String s) {
    for(int i=s.length()-1; i>=0; i--){
        if(s.charAt(i)=='2')
        return s.substring(0,i+1);
    }
    return "";    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna