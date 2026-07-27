class Solution {
    public int mySqrt(int x) {
    long l=0,h=x;
    while(l<=h){
        long m=l+(h-l)/2;
        if(m*m==x)
        return (int)m;
        else if(m*m>=x)
        h=m-1;
        else
        l=m+1;
    }
    return (int)h;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna