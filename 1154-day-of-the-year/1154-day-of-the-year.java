class Solution {
    public int dayOfYear(String s) {
    int y =Integer.parseInt(s.substring(0,4));
    int m =Integer.parseInt(s.substring(5,7));
    int d =Integer.parseInt(s.substring(8,10));
    int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
    if(y%400==0 || (y%100!=0 && y%4==0))
    arr[1]=29;
    int ans=d;
    for(int i=0; i<m-1; i++){
    ans+=arr[i];
    }   
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna