class Solution {
    public int sumOfGoodIntegers(int n, int k) {
    int res=0;
    for(int x=n-k; x<=n+k; x++){
        if(x>0 && ((n&x)==0)) res+=x;
    }    
    return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna