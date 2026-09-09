class Solution {
    public int findFinalValue(int[] arr, int n) {
    HashSet<Integer> set = new HashSet<>();
    for(int ele : arr)
        set.add(ele);
    for(int ele : set){
        if(set.contains(n)) 
            n*=2;
        else
            break;
    }
    return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna