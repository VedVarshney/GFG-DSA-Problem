class Solution {
    public int[] findDegrees(int[][] arr) {
    int n=arr.length;
    int[] ans = new int[n];
    for(int i=0; i<n; i++){
    int c=0;
    for(int j=0; j<n; j++){
        if(arr[i][j]==1)
        c++;
    }
    ans[i]=c;
    }    
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna