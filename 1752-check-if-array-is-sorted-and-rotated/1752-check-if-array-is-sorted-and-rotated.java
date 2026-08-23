class Solution {
    public boolean sorted(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1])
            return false;
        }
        return true;
    }
    public void rotated(int[] arr){
        int n=arr.length;
        int last=arr[n-1];
        for(int i=n-2; i>=0; i--){
            arr[i+1]=arr[i];
        }
        arr[0]=last;
    }
    
    public boolean check(int[] arr) {
    int n=arr.length;
    for(int i=0; i<n; i++){
    if(sorted(arr)) return true;
    rotated(arr);  
    }  
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna