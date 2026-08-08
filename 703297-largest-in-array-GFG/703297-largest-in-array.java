class Solution {
    public static int largest(int[] arr) {
    int mx=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        mx=Math.max(mx,arr[i]);
    }
    return mx;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna