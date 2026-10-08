class Solution {
    public int uniqueMorseRepresentations(String[] arr) {
    HashSet<String> set = new HashSet<>();
    String[] morse={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 
    for(int i=0; i<arr.length; i++){
    String temp=arr[i];
    String a="";
    for(int j=0; j<temp.length(); j++){
    char ch = temp.charAt(j);
    int ix=((int)ch)-97;
    a+=morse[ix];
    }
    set.add(a);
    }   
    return set.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna