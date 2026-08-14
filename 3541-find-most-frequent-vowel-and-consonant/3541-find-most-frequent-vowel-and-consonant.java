class Solution {
    public int maxFreqSum(String s) {
    int[] frr = new int[26];
    for(int i=0; i<s.length(); i++){
        int as=s.charAt(i)-'a';
        frr[as]++;
    }  
    int vf=0;  
    int cf=0;
    for(int i=0; i<26; i++){
    if(i==0||i==4||i==8||i==14||i==20){
       if(frr[i]>vf)
          vf=frr[i];
    }else{
        if(frr[i]>cf)
          cf=frr[i];
    }
    }
    return vf+cf;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna