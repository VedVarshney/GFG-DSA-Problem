class Solution {
    public int countDistinctIntegers(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for(int k=0; k<arr.length; k++){
        set.add(arr[k]);
        int rv=0;
        for(int i=arr[k]; i>0; i/=10){
        rv=rv*10+i%10;
        }
        set.add(rv);
    }   
    return set.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna