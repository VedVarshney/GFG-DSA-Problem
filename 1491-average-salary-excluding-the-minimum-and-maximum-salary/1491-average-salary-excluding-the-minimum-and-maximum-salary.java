class Solution {
    public double average(int[] arr) {
    int mx=arr[0];
    int mn=arr[0];
    for(int i=1; i<arr.length; i++){
        if(arr[i]>mx)
        mx=arr[i];
        if(arr[i]<mn)
        mn=arr[i];
    } 
    int sum=0,c=0;   
    for(int i=0; i<arr.length; i++){
        if(arr[i]!=mx && arr[i]!=mn){
        sum+=arr[i];
        c++;
        }
    }
    return (double)sum/c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna