class Solution {
    public int maxProduct(int[] arr) {
    int n=arr.length;
    int mx=Integer.MIN_VALUE;
    int ix=0;
    for(int i=0; i<n; i++){
        if(arr[i]>mx){
            mx=arr[i];
            ix=i;
        }
    }    
    int smx=Integer.MIN_VALUE;
    for(int i=0; i<n; i++){
        if(arr[i]>smx && i!=ix){
            smx=arr[i];
        }
    } 
    return (mx-1)*(smx-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna