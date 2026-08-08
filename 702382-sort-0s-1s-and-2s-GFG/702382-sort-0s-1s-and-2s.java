class Solution {
    public void sort012(int[] arr) {
    int l=0,m=0,h=arr.length-1;
    while(m<=h){
        if(arr[m]==0){
            int t=arr[l];
            arr[l]=arr[m];
            arr[m]=t;
            l++;
            m++;
        }
        else if(arr[m]==1){
            m++;
        }else{
            int t=arr[m];
            arr[m]=arr[h];
            arr[h]=t;
            h--; 
        }
    }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna