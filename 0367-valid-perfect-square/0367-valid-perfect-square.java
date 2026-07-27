class Solution {
    public boolean isPerfectSquare(int num) {
    long l=0,h=num;
    while(l<=h){
        long m=l+(h-l)/2;
        if(m*m==num)
        return true;
        else if(m*m>num)
        h=m-1;
        else
        l=m+1;
    }    
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna