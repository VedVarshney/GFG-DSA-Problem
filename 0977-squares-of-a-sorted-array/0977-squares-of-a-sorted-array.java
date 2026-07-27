class Solution {
    public int[] sortedSquares(int[] arr) {
    int n=arr.length;
    int[] ans=new int[n];  
    int l=0,h=n-1,k=n-1;
    while(l<=h){
        int res=0;
        if(arr[l]*arr[l]>arr[h]*arr[h]){
        res=arr[l]*arr[l];
        l++;
        }
        else{
        res=arr[h]*arr[h];
        h--;
        }
        ans[k--]=res;
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna