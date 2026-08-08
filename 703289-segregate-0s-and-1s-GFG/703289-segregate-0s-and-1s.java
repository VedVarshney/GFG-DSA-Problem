class Solution {
    void segregate0and1(int[] arr) {
    int n=arr.length;
    int noz=0;
    for(int i=0; i<n; i++){
        if(arr[i]==0)
        noz++;
    }
    for(int i=0; i<n; i++){
        if(i<noz)
        arr[i]=0;
        else
        arr[i]=1;
    }
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna