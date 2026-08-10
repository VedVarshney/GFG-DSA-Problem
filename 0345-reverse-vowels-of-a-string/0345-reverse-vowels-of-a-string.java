class Solution {
    public boolean vowel(char x){
        if(x=='a' || x=='A') return true;
        if(x=='e' || x=='E') return true;
        if(x=='i' || x=='I') return true;
        if(x=='o' || x=='O') return true;
        if(x=='u' || x=='U') return true;
        return false;
    }
    public String reverseVowels(String s) {
    StringBuilder sb = new StringBuilder(s);
    int i=0,j=sb.length()-1;
    while(i<j){
    if(vowel(sb.charAt(i)) && vowel(sb.charAt(j))){
        char ch=sb.charAt(i);
        sb.setCharAt(i,sb.charAt(j));
        sb.setCharAt(j,ch);
        i++;
        j--;
    }else if(!vowel(sb.charAt(i))){
        i++;
    }else{
        j--;
    }
    }
    return sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna