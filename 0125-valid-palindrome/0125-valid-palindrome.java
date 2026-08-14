class Solution {
    public boolean isPalindrome(String s) {
    s=s.toLowerCase();
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<s.length(); i++){
        int as=s.charAt(i);
        if((as>=97 && as<=122) || (as>=48 && as<=57))
        sb.append((char)as);
    }
    int i=0,j=sb.length()-1;
    while(i<j){
    if(sb.charAt(i)!=sb.charAt(j))
    return false;
    i++;
    j--;
    }   
    return true; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna