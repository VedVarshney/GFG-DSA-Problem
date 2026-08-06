class Solution {
    public int minAbsoluteDifference(int[] arr) {
    int n=arr.length;
    int min=Integer.MAX_VALUE;
    boolean flag=false;
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            if(arr[i]==1 && arr[j]==2){
                min=Math.min(min,Math.abs(i-j));
                flag=true;
            }
        }
    }  
    if(flag==false) return -1;
    return min;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna