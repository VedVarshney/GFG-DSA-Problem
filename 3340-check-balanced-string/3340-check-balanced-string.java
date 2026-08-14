class Solution {
    public boolean isBalanced(String s) {
    int ev=0,od=0;
    for(int i=0; i<s.length(); i++){
        if(i%2==0){
        ev+=s.charAt(i)-48;
        }else{
        od+=s.charAt(i)-48;
        }
    }
    if(ev==od) return true;
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna