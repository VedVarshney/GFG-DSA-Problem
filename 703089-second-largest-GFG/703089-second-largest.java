class Solution {
    public int getSecondLargest(int[] arr) {
    int mx=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>mx)
        mx=arr[i];
    }
    int smx=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>smx && arr[i]<mx)
        smx=arr[i];
    }
    if(smx==Integer.MIN_VALUE) return -1;
    return smx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna