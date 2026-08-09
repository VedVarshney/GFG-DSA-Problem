class Solution {
    public int[] countOddEven(int[] arr) {
    int[] ans = new int[2];
    int e=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]%2==0)
        e++;
    }
    ans[0]=arr.length-e;
    ans[1]=e;
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna