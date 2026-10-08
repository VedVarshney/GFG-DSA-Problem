class Solution {
    public int reverseBits(int n) {
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<32; i++){
    sb.append(n%2);
    n/=2;    
    }    
    int ans=0;
    int k=0;
    for(int i=31; i>=0; i--){
    ans+=(sb.charAt(i)-'0')*((int)Math.pow(2,k++));
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna