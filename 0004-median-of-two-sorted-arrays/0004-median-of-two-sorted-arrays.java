class Solution {
    public double findMedianSortedArrays(int[] arr, int[] brr) {
    int i=0,j=0,k=0;
    int[] crr = new int[arr.length+brr.length];
    while(i!=arr.length && j!=brr.length){
        if(arr[i]<brr[j]){
            crr[k]=arr[i];
            i++;
        }else{
            crr[k]=brr[j];
            j++;
        }
        k++;
    }    
    while(i<arr.length){
       crr[k]=arr[i];
        i++;
        k++; 
    }
    while(j<brr.length){
       crr[k]=brr[j];
        j++;
        k++; 
    }
    if(crr.length%2==0){
        return (crr[crr.length/2]+crr[crr.length/2-1])/2.0;
    }
    return (double)crr[crr.length/2];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna