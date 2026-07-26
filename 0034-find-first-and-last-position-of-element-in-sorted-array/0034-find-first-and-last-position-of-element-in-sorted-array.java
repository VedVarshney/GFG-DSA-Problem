class Solution {
    public int[] searchRange(int[] arr, int x) {
    int[] ans={-1,-1};
    int l=0,h=arr.length-1;
    int fp=-1;
    while(l<=h){
        int m=l+(h-l)/2;
        if(arr[m]==x){
            if(m>0 && arr[m]==arr[m-1])
            h=m-1;
            else{
            fp=m;
            break;
            }
        }else if(arr[m]>x)
        h=m-1;
        else
        l=m+1;
    }
    ans[0]=fp;
    int lp=-1;
    l=0; h=arr.length-1;
    while(l<=h){
        int m=l+(h-l)/2;
        if(arr[m]==x){
            if(m<arr.length-1 && arr[m]==arr[m+1])
            l=m+1;
            else{
            lp=m;
            break;
            }
        }else if(arr[m]>x)
           h=m-1;
        else
          l=m+1;
    }
    ans[1]=lp;
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna