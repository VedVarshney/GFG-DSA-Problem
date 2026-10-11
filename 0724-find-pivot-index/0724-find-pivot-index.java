class Solution {
    public int pivotIndex(int[] arr) {
    for(int i=1; i<arr.length; i++) 
        arr[i]+=arr[i-1];
    for(int i=0; i<arr.length; i++){
        int leftsum=0;
        if(i>0) leftsum=arr[i-1];
        int rightsum=arr[arr.length-1]-arr[i];
        if(leftsum==rightsum) return i;
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna