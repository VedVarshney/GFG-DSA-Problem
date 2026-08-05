class Solution {
    public int singleNumber(int[] arr) {
    int ans=0;
    for(int ele : arr){
        ans^=ele;
    } 
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna