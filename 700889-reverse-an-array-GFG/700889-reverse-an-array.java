class Solution {
    public void reverseArray(int arr[]) {
    int n=arr.length;
    int[] ans = new int[n];
    int j=0;
    for(int i=n-1; i>=0; i--){
        ans[j++]=arr[i];
    }
    for(int i=0; i<n; i++){
        arr[i]=ans[i];
    }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna