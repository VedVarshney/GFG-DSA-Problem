class Solution {
    public boolean canAliceWin(int[] arr) {
    int alice=0;
    int bob=0;
    for(int ele : arr){
        if(ele>0 && ele<10)
        alice+=ele;
        else
        bob+=ele;
    }
    if(alice>bob) return true;
    alice=0; bob=0;
    for(int ele : arr){
        if(ele>9 && ele<100)
        alice+=ele;
        else
        bob+=ele;
    }
    if(alice>bob) return true;
    return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna