class Solution {
    public int search(int[] arr, int target) {
    int n=arr.length;
    int l=0,h=n-1;
    while(l<=h){
        int m = l + (h-l)/2;
        if(arr[m]==target)
        return m;
        else if(arr[m]>target)
        h=m-1;
        else
        l=m+1;
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna