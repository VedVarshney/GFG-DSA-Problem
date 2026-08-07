class Solution {
    public int[] getConcatenation(int[] arr) {
    int n=arr.length;
    int[] ans=new int[2*n];
    int j=0;
    for(int i=0; i<2*n; i++){
        if(i<n){
            ans[i]=arr[i];
        }else{
            ans[i]=arr[j++];
        }
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna