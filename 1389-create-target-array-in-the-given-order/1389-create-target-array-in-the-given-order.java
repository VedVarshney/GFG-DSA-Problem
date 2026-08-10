class Solution {
    public int[] createTargetArray(int[] arr, int[] index) {
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
      al.add(index[i],arr[i]);
    }    
    for(int i=0; i<al.size(); i++)
    arr[i]=al.get(i);
    return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna