class Solution {
    public List<Integer> findPeaks(int[] arr) {
    ArrayList<Integer> al = new ArrayList<>();
    int n=arr.length;
    for(int i=1; i<n-1; i++){
        if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
        al.add(i);
    }    
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna