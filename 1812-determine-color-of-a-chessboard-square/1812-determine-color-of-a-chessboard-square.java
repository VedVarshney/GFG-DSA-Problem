class Solution {
    public boolean squareIsWhite(String s) {
    int x=(int)s.charAt(0)-96;
    int y=s.charAt(1)-'0';
    return ((x+y)%2==0) ? false : true; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna