class Solution {
    public String removeTrailingZeros(String s) {
    int n=s.length();
    int j=0;
    for(int i=n-1; i>=0; i--){
        if(s.charAt(i)!='0')
        return s.substring(j,i+1);
    }
    return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna