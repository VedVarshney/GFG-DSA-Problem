class Solution {
    public int countMonobit(int n) {
    int c=1;
    int x=1;
    while(x<=n){
    c++;
    x=x*2+1;
    }
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna