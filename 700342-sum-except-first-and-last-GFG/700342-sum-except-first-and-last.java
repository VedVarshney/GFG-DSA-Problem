class Solution {
    public int sumExceptFirstLast(int[] arr) {
    int s=0;
    for(int i=1; i<arr.length-1; i++){
        s+=arr[i];
    }
    return s;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna