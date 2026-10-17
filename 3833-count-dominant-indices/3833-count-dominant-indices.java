class Solution {
    public int dominantIndices(int[] arr) {
    int n=arr.length;
    int[] ans = new int[n];
    ans[n-1]=arr[n-1];
    for(int i=n-2; i>=0; i--){
    ans[i]=arr[i]+ans[i+1];
    }    
    int c=0;
    for(int i=0; i<n-1; i++){
    if(arr[i]>((ans[i+1])/(n-i-1))) c++;
    }
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna