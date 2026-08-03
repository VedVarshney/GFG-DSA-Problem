class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
    int ans=0,c=0;
    int i=0;
    while(i<arr.length){
        if(arr[i]==1)
        c++;
        else{
            ans=Math.max(c,ans);
            c=0;
        }
        i++;
    }   
    ans=Math.max(ans,c);
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna