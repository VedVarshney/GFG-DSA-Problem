class Solution {
    public int min(int n){
    int  mn=n%10;
    while(n>0){
        int rm=n%10;
        mn=Math.min(rm,mn);
        n/=10;
    }
    return mn;
    }
    public int max(int n){
    int  mx=n%10; 
    while(n>0){
        int rm=n%10;
        mx=Math.max(rm,mx);
        n/=10;
    }  
    return mx; 
    }
    public int maxDigitRange(int[] arr) {
    int[] r=new int[arr.length];
    for(int i=0; i<arr.length; i++){
    int x=arr[i];
    r[i]=max(x)-min(x);
    } 
    int mx=Integer.MIN_VALUE;
    for(int i=0; i<r.length; i++){
        mx=Math.max(mx,r[i]);
    }
    int sum=0;
    for(int i=0; i<r.length; i++){
        if(r[i]==mx){
        sum+=arr[i];
        }
    }
    return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna