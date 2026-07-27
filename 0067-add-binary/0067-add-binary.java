class Solution {
    public String addBinary(String a, String b){
    int i=a.length()-1;
    int j=b.length()-1;
    StringBuilder sb = new StringBuilder();
    int carry=0;
    while(i>=0 && j>=0){
    int sum=(a.charAt(i)-'0')+(b.charAt(j)-'0')+carry;
    sb.append(sum%2);
    carry=sum/2;
    i--;
    j--;
    }
    while(i>=0){
    int sum=(a.charAt(i)-'0')+carry;
    sb.append(sum%2);
    carry=sum/2;
    i--;
    }
    while(j>=0){
    int sum=(b.charAt(j)-'0')+carry;
    sb.append(sum%2);
    carry=sum/2;
    j--;
    }
    if(carry!=0) sb.append(carry);
    return sb.reverse().toString();  
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna