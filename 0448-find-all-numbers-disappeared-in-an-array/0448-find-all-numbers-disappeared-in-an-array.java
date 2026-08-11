class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
    ArrayList<Integer> al = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    int n=arr.length;  
    for(int ele : arr){
    set.add(ele);
    }
    for(int i=1; i<=arr.length; i++){
        if(!set.contains(i))
        al.add(i);
    }
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna