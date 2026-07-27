class Solution {
    public String addStrings(String num1, String num2) {
    int i=num1.length()-1;
    int j=num2.length()-1;
    StringBuilder sb = new StringBuilder();
    int carry=0;
    while(i>=0 && j>=0){
    int sum=(num1.charAt(i)-'0')+(num2.charAt(j)-'0')+carry;
    sb.append(sum%10);
    carry=sum/10;
    i--;
    j--;
    }
    while(i>=0){
    int sum=(num1.charAt(i)-'0')+carry;
    sb.append(sum%10);
    carry=sum/10;
    i--;
    }
    while(j>=0){
    int sum=(num2.charAt(j)-'0')+carry;
    sb.append(sum%10);
    carry=sum/10;
    j--;
    }
    if(carry!=0) sb.append(carry);
    return sb.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna