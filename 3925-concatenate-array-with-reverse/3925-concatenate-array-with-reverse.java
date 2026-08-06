class Solution {
    public int[] concatWithReverse(int[] arr) {
    int n=arr.length;
    int[] ans = new int[2*n];
    for(int i=0; i<n; i++){
        ans[i]=arr[i];
    }   
    int j=n-1;
    for(int i=n; i<ans.length; i++){
        ans[i]=arr[j--];
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna