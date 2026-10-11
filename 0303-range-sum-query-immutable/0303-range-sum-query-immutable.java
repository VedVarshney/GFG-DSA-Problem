class NumArray {
    int[] arr;
    public NumArray(int[] nums) {
    arr=nums;       
    }
    public int sumRange(int l, int r) {
    int sum=0;
    for(int i=l; i<=r; i++){
        sum+=arr[i];
    }
    return sum;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna