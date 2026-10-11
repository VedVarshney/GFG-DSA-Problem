class Solution {
    public long[] findPrefixScore(int[] arr) {
    int n = arr.length;
    long[] ans = new long[n];
    int mx=arr[0];
    for(int i=0; i<n; i++){
    mx=Math.max(mx,arr[i]);
    ans[i]=arr[i]+mx;   
    }  
    for(int i=1; i<n; i++){
        ans[i]+=ans[i-1];
    } 
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna