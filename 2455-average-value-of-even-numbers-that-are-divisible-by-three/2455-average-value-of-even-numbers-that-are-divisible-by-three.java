class Solution {
    public int averageValue(int[] arr) {
    int c=0,sum=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]%2==0 && arr[i]%3==0){
        sum+=arr[i];
        c++;
        }
    }    
    if(c==0) return 0;
    return (int)sum/c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna