class Solution {
    public long maximumTripletValue(int[] arr) {
    int n=arr.length;
    long mx=0;
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            for(int k=j+1; k<n; k++){
            long a=(long)(arr[i]-arr[j])*arr[k];
            mx=Math.max(a,mx);
            }
        }
    }   
    return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna