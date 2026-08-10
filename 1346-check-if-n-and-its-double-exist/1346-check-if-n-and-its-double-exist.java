class Solution {
    public boolean checkIfExist(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    for(int ele : arr){
        if(set.contains(2*ele) || (ele%2==0 && set.contains(ele/2)))
        return true;
        else
        set.add(ele);
    }
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna