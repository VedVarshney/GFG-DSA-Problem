class Solution {
    public int[] shuffle(int[] arr, int n){
    int[] ans=new int[2*n];   
    int i=0,j=n;
    int k=0;
    while(i<n && j<arr.length){
    ans[k++]=arr[i++];
    ans[k++]=arr[j++];
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna