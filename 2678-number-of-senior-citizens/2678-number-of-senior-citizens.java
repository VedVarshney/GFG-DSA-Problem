class Solution {
    public int countSeniors(String[] arr) {
    int c=0;
    for(int i=0; i<arr.length; i++){
        String x=arr[i].substring(11,13);
        int age=Integer.parseInt(x);
        if(age>60)
        c++;
    }    
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna