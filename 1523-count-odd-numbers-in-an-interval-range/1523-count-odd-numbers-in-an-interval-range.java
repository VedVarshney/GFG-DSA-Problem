class Solution {
    public int countOdds(int l, int h) {
    int c=1+(h-l)/2;
    if(l%2==0 && h%2==0) c-=1;
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna