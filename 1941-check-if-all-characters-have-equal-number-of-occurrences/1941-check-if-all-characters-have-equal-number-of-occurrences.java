class Solution {
    public boolean areOccurrencesEqual(String s) {
    int[] frr=new int[26];
    for(int i=0; i<s.length(); i++){
        int as=(char)s.charAt(i)-96;
        frr[as-1]++;
    }    
    HashSet<Integer> set = new HashSet<>();
    for(int ele : frr){
    if(ele>0)
    set.add(ele);
    }
    return set.size()==1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna