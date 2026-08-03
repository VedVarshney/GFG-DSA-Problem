class Solution {
    public int maxProductDifference(int[] arr) {
    int n=arr.length;
    int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,Mix=-1;
    int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,mix=-1;
    for(int i=0; i<n; i++){
        if(arr[i]>max1){
        max1=arr[i];
        Mix=i;
        }
    }
    for(int i=0; i<n; i++){
        if(arr[i]>max2 && i!=Mix)
        max2=arr[i];
    }
    for(int i=0; i<n; i++){
        if(arr[i]<min1){
        min1=arr[i];
        mix=i;
        }
    }
    for(int i=0; i<n; i++){
        if(arr[i]<min2 && i!=mix)
        min2=arr[i];
    }
    return (max1*max2)-(min1*min2);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna