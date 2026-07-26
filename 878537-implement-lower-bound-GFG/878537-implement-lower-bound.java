class Solution {
    int lowerBound(int[] arr, int target) {
    int lb=arr.length;
    int l=0,h=arr.length-1;
    while(l<=h){
        int m=l+(h-l)/2;
        if(arr[m]>=target){
            lb=Math.min(lb,m);
            h=m-1;
        }else{
            l=m+1;
        }
    }
    return lb;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna