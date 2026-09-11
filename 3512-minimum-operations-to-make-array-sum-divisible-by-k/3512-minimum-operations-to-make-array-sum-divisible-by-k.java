class Solution {
    public int minOperations(int[] arr, int k) {
    int s=0;
    for(int i=0; i<arr.length; i++){
        s+=arr[i];
    }   
    return s%k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna