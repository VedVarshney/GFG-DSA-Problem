class Solution {
    public int[] searchRange(int[] arr, int x) {
    int[] ans={-1,-1};
    int l=0,h=arr.length-1;
    boolean flag=false;
    while(l<=h){
        int m=l+(h-l)/2;
        if(arr[m]==x){
            flag=true;
            break;
        }else if(arr[m]>x)
            h=m-1;
        else
            l=m+1;
    }
    if(flag==false)
    return ans;
    int lb=arr.length;
    l=0; h=arr.length-1;
    while(l<=h){
        int m=l+(h-l)/2;
        if(arr[m]>=x){
        lb=Math.min(lb,m);
        h=m-1;
        }
        else
            l=m+1;
    }
    ans[0]=lb;
    int ub=arr.length;
    l=0; h=arr.length-1;
    while(l<=h){
        int m=l+(h-l)/2;
        if(arr[m]>x){
        ub=Math.min(ub,m);
        h=m-1;
        }
        else
            l=m+1;
    }
    ans[1]=ub-1;
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna