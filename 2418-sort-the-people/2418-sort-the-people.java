class Solution {
    public String[] sortPeople(String[] nrr, int[] hrr) {
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0; i<hrr.length; i++){
        map.put(hrr[i],i);
    }
    String[] ans = new String[nrr.length];
    Arrays.sort(hrr);
    int j=0;
    for(int i=hrr.length-1; i>=0; i--){
    ans[j++]=nrr[map.get(hrr[i])];
    } 
    return ans;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna