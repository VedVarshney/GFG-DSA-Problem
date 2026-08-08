class Solution {
    public int[] replaceElements(int[] arr) {
    int n = arr.length;
    int[] ans = new int[n];    
    ans[n-1]=-1;
    int nge=arr[n-1];
    for(int i=n-2; i>=0; i--){
    ans[i]=nge;
    nge=Math.max(nge,arr[i]);
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna