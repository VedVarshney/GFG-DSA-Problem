class Solution {
    public int minNumber(int[] arr, int[] brr) {
    Arrays.sort(arr);
    Arrays.sort(brr);
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<brr.length; j++){
            if(arr[i]==brr[j]) return arr[i];
        }
    }
    int a=0;
    a=arr[0];
    a=a*10+brr[0];
    int b=0;
    b=brr[0];
    b=b*10+arr[0];
    if(a<b) return a;
    return b;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna