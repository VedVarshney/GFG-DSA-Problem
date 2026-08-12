class Solution {
    public int distinctAverages(int[] arr) {
    Arrays.sort(arr);   
    int i=0,j=arr.length-1;
    HashSet<Double> set = new HashSet<>();
    while(i<j){
    double avg=(arr[i]+arr[j])/2.0;
    set.add(avg);
    i++;
    j--;
    }
    return set.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna