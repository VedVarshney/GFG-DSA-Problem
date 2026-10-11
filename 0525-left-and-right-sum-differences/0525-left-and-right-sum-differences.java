class Solution {
    public int[] leftRightDifference(int[] arr) {
    int n=arr.length;
    int[] pre = new int[n]; 
    pre[0]=0;   
    for(int i=1; i<n; i++){
        pre[i]=pre[i-1]+arr[i-1];
    }
    int[] suf = new int[n];  
    suf[n-1]=0;  
    for(int i=n-2; i>=0; i--){
        suf[i]=suf[i+1]+arr[i+1];
    }
    for(int i=0; i<n; i++){
        pre[i]=Math.abs(pre[i]-suf[i]);
    }
    return pre;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna