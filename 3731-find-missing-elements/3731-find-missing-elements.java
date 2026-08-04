class Solution {
    public List<Integer> findMissingElements(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    ArrayList<Integer> al = new ArrayList<>();
    int mx=arr[0];
    for(int i=1; i<arr.length; i++){
        if(arr[i]>mx)
        mx=arr[i];
    }
    int mn=arr[0];
    for(int i=1; i<arr.length; i++){
        if(arr[i]<mn)
        mn=arr[i];
    }
    for(int ele : arr){
        set.add(ele);
    }
    for(int i=mn; i<=mx; i++){
        if(set.contains(i)==false)
        al.add(i);
    }
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna