class Solution {
    public int reverseDigits(int n) {
    int rv=0;
    for(int i=n; i>0; i/=10){
        rv=rv*10+i%10;
    }
    return rv;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna