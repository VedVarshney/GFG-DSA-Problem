class Solution {
    public int[] sumZero(int n) {
    int[] ans = new int[n];
    int y=n;
    int x=-n;
    for(int i=0; i<n; i++){
      if(i<n/2){
        ans[i]=y--;
      }else{
        if(n%2==1 && i==n-1)
        ans[n-1]=0;
        else
        ans[i]=x++;
      }
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna