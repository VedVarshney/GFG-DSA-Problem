class Solution {
    public boolean isPowerOfThree(int n) {
    if(n==1) return true;
    if(n<=0 || n%3!=0) return false;
    return isPowerOfThree(n/3);    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna