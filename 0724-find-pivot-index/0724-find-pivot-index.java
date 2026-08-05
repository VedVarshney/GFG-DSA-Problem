class Solution {
    public int pivotIndex(int[] arr) {
    int n=arr.length;
    for(int i=1; i<n; i++){
    arr[i]+=arr[i-1];
    }
    for(int i=0; i<n; i++){
        int leftSum=0;
        if(i>0) leftSum=arr[i-1];
        int rightSum=arr[n-1]-arr[i];
    if(leftSum==rightSum) return i;
    }    
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna