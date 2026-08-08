class Solution {
    public int[] replaceElements(int[] arr) {
    int n = arr.length;
    int nge=arr[n-1];
    arr[n-1]=-1;
    for(int i=n-2; i>=0; i--){
        int curr=arr[i];
        arr[i]=nge;
        nge=Math.max(nge,curr);

    }
    return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna