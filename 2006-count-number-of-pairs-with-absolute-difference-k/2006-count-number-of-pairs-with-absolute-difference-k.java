class Solution {
    public int countKDifference(int[] arr, int k) {
    int p=0;
    for(int i=0; i<arr.length; i++){
        for(int j=i+1; j<arr.length; j++){
            if(Math.abs(arr[i]-arr[j])==k)
            p++;
        }
    }    
    return p;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna