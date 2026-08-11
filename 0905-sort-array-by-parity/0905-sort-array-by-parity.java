class Solution {
    public int[] sortArrayByParity(int[] arr) {
    int i=0,j=arr.length-1;
    while(i<j){
        if(arr[i]%2==0)
        i++;
        else if(arr[j]%2==1)
        j--;
        else if(arr[i]%2==1 && arr[j]%2==0){
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }   
    return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna