class Solution {
    public int earliestTime(int[][] arr) {
    int n =arr.length;
    int ans=Integer.MAX_VALUE;
    for(int i=0; i<n; i++){
        int s=0;
        for(int j=0; j<2; j++){
        s+=arr[i][j];
        }
        ans=Math.min(ans,s);
    }    
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna