class Solution {
    public int vowelConsonantScore(String s) {
    int v=0,c=0,sc=0,sp=0,n=0;
    for(int i=0; i<s.length(); i++){
        char ch=s.charAt(i);
        int as=ch;
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            v++;
        }
        else if(as>=48 && as<=57){
            n++;
        }
        else if(as==32)
        sp++;
    } 
    c=s.length()-n-v-sp;
    if(c>0)
    sc=v/c;
    return sc; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna