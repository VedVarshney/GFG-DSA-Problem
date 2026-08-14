class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
    Arrays.sort(arr);
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
        if(arr[i]==target)
        al.add(i);
    }    
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna