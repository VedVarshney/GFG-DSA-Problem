class Solution {
    public List<Integer> findWordsContaining(String[] arr, char x) {
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=0; i<arr.length; i++){
        String s=arr[i];
        String xx="";
        xx+=x;
        if(s.contains(xx))
        al.add(i);
    }    
    return al;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna