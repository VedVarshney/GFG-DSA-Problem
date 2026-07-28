class Solution {
    public boolean judgeSquareSum(int c) {
    long l=0; long h=(long)Math.sqrt(c);
    while(l<=h){
        long res=l*l+h*h;
        if(res==c)
        return true;
        else if(res>c)
        h--;
        else
        l++;
    }    
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna