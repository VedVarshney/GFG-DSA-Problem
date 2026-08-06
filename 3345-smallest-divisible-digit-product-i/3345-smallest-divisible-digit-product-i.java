class Solution {
    public int count(int n){
        int rm,pr=1;
        while(n>0){
            rm=n%10;
            pr*=rm;
            n/=10;
        }
        return pr;
    }
    public int smallestNumber(int n, int t) {
    for(int i=n; i>0; i++){
        if(count(i)%t==0)
        return i;
    }
    return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna