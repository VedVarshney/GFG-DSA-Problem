class Solution {
    public long countCommas(long x) {
    String s=Long.toString(x);
    int n=s.length();
    long c=0;
    if(n==4 || n==5 || n==6){
    c+=x-999;
    }
    else if(n==7 || n==8 || n==9){
    c+=x-999;
    c+=x-999999;
    }
    else if(n==10 || n==11 || n==12){
    c+=x-999;
    c+=x-999999;
    c+=x-999999999L;  
    } 
    else if(n==13 || n==14 ||n==15){
    c+=x-999;
    c+=x-999999;
    c+=x-999999999L;  
    c+=x-999999999999L;    
    }
    if(n==16){
    c+=x-999;
    c+=x-999999;
    c+=x-999999999L;  
    c+=x-999999999999L;  
    c+=x-999999999999999L;  
    }
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna