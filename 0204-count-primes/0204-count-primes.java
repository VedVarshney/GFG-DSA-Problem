class Solution {
    public int countPrimes(int n) {
    boolean[] arr = new boolean[n+1];  
    for(int i=0; i<=n; i++){
        arr[i]=true;
    } 
    int c=0;
    for(int i=2; i<n; i++){
        if(arr[i]) {
            c++;
        for(int j=i*2; j<=n; j+=i)
        arr[j]=false;
        }

    }
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna