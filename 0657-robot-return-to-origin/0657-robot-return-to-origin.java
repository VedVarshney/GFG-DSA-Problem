class Solution {
    public boolean judgeCircle(String s) {
    int x=0,y=0;
    for(int i=0; i<s.length(); i++){
        char ch = s.charAt(i);
        if(ch=='U'){
        y++;
        }else if(ch=='D'){
        y--;    
        }else if(ch=='R'){
        x++;    
        }else{
        x--;  
        }
    }  
    if(x==0 && y==0) return true;
    return false;  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna