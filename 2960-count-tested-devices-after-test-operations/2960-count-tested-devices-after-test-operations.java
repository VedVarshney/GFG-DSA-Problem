class Solution {
    public int countTestedDevices(int[] arr) {
    int n=arr.length;
    int t=0;
    for(int i=0; i<n; i++){
        if(arr[i]>0) {
        t++;
        for(int j=i+1; j<n; j++){
            arr[j]-=1;
        }
        }
    } 
    return t;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna