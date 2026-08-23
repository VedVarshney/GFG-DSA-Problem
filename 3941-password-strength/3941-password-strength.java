class Solution {
    public int passwordStrength(String s) {
    HashSet<Character> set = new HashSet<>();
    for(int i=0; i<s.length(); i++){
        set.add(s.charAt(i));
    }  
    int ans=0;
    for(char ch : set){
        if(ch>='0' && ch<='9')
        ans+=3;
        else if(ch>='A' && ch<='Z')
        ans+=2;
        else if(ch>='a' && ch<='z')
        ans+=1;
        else
        ans+=5;
    }
    return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna