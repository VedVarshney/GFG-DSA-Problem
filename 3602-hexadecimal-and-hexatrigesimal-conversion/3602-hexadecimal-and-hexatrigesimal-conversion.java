class Solution {
    public String concatHex36(int n) {
    StringBuilder x = new StringBuilder();
    int hx=n*n;
    while(hx>0){
    int rm=hx%16;
    if(rm>9)
    x.append((char)(rm-9+64));
    else
    x.append(rm);
    hx/=16;
    }
    x.reverse();  
    StringBuilder y = new StringBuilder();  
    int fx=n*n*n;
    while(fx>0){
    int rm=fx%36;
    if(rm>9)
    y.append((char)(rm-9+64));
    else
    y.append(rm);
    fx/=36;
    } 
    y.reverse(); 
    return x.append(y).toString(); 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna