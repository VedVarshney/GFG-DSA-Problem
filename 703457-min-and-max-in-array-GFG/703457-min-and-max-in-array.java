class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
    int mx=Integer.MIN_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i]>mx)
        mx=arr[i];
    }
    int mn=Integer.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
        if(arr[i]<mn)
        mn=arr[i];
    }
    ArrayList<Integer> al = new ArrayList<>();
    al.add(mn);
    al.add(mx);
    return al;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna