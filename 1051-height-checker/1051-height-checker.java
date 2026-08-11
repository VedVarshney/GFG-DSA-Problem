class Solution {
    public int heightChecker(int[] arr) {
    int n=arr.length;
    int[] ans = Arrays.copyOf(arr,arr.length);
    Arrays.sort(ans);
    int c=0;
    for(int i=0; i<n; i++){
    if(arr[i]!=ans[i])
    c++;
    }
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna