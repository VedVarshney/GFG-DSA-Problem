class Solution {
    public String getEncryptedString(String s, int k) {
    int n=s.length();
    k=k%n;
    String x="";
    x+=s.substring(k,n);    
    x+=s.substring(0,k);
    return x;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna