class Solution {
    public int reverseDegree(String s) {
    int ans=0;
    for(int i=0; i<s.length(); i++){
        int as=s.charAt(i)-96;
        ans=ans+(i+1)*(27-as);
    }    
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna