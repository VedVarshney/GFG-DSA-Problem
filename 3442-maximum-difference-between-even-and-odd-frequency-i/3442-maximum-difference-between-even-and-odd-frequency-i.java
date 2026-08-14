class Solution {
    public int maxDifference(String s) {
    int[] frr = new int[26];
    for(int i=0; i<s.length(); i++){
        int as=s.charAt(i)-'a';
        frr[as]++;
    }   
    int od=0,ev=Integer.MAX_VALUE;
    for(int i=0; i<26; i++){
    if(frr[i]%2==1){
       if(frr[i]>od)
       od=frr[i];
    }else{
       if(frr[i]<ev && frr[i]!=0)
       ev=frr[i];
    }
    }
    return od-ev;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna