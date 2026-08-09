class Solution {
    public List<Boolean> kidsWithCandies(int[] arr, int c) {
    int mx=arr[0];
    for(int i=1; i<arr.length; i++){
        if(arr[i]>mx)
        mx=arr[i];
    }
    ArrayList<Boolean> al = new ArrayList<>();
    int x=mx-c;
    for(int i=0; i<arr.length; i++){
        if(arr[i]<x)
        al.add(false);
        else
        al.add(true);
    }
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna