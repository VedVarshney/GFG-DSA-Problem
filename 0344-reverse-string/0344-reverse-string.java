class Solution {
    public void reverseString(char[] arr) {
    int i=0,j=arr.length-1;
    while(i<j){
        char ch=arr[i];
        arr[i]=arr[j];
        arr[j]=ch;
        i++;
        j--;
    }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna