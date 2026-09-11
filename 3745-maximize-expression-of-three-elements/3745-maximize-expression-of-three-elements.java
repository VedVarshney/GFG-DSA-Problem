class Solution {
    public int maximizeExpressionOfThree(int[] arr) {
    Arrays.sort(arr);
    int n=arr.length;
    return arr[n-1]+arr[n-2]-arr[0];    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna