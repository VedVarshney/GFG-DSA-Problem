class Solution {
    public ArrayList<Integer> getAlternates(int arr[]) {
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
        if(i%2==0)
            al.add(arr[i]);
    }
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna