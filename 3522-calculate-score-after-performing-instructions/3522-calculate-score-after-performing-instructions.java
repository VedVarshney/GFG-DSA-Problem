class Solution {
    public long calculateScore(String[] arr, int[] val) {
    HashSet<Integer> set = new HashSet<>();
    int n = arr.length;
    long score=0;
    int i=0;
    while(i<n && i>=0){
    if(set.contains(i))
    break;
    String s = arr[i];
    if(s.equals("add")){
        score+=val[i];
        set.add(i);
        i++;
    }else{
        set.add(i);
        i+=val[i];   
    }
    }
    return score;    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna