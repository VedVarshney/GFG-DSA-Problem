class Solution {
    public int maximumValue(String[] arr) {
    int n=arr.length;
    int[] ans = new int[n];    
    for(int i=0; i<arr.length; i++){
    String s=arr[i];
    boolean flag=true;
    for(int j=0; j<s.length(); j++){
        if(s.charAt(j)>=97 && s.charAt(j)<=122){
           flag=false;
           break;
        }
    }
    if(!flag) 
    ans[i]=s.length();
    else
    ans[i]=Integer.parseInt(s);
    }
    int mx=Integer.MIN_VALUE;
    for(int i=0; i<ans.length; i++){
    if(ans[i]>mx)
    mx=ans[i];    
    }
    return mx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna