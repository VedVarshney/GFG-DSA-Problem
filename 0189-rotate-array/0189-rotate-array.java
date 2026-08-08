class Solution {
    public void rev(int[] arr , int i , int j){
        while(i<j){
            int t =arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public void rotate(int[] arr, int k) {
    int n=arr.length;
    k=k%n;
    rev(arr,0,n-k-1);
    rev(arr,n-k,n-1);
    rev(arr,0,n-1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna