class Solution {
    public void rotate(int[] arr, int k) {
    int n=arr.length;
    int[] ans = new int[n];
    k=k%n;
    int j=0;
    for(int i=n-k; i<n; i++){
        ans[j++]=arr[i];
    }
    for(int i=0; i<n-k; i++){
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