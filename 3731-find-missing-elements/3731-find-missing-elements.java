class Solution {
    public List<Integer> findMissingElements(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    Arrays.sort(arr);
    ArrayList<Integer> al = new ArrayList<>();
    for(int ele : arr){
        set.add(ele);
    }
    for(int i=arr[0]; i<=arr[arr.length-1]; i++){
        if(set.contains(i)==false)
        al.add(i);
    }
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna