class Solution {
    public int getCommon(int[] arr, int[] brr) {
    HashSet<Integer> set =new HashSet<>();
    for(int i=0; i<brr.length; i++){
        set.add(brr[i]);
    }
    for(int i=0; i<arr.length; i++){
        if(set.contains(arr[i]))
        return arr[i];
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna