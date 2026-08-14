class Solution {
    public int fun(String s){
    int i=0,j=0;
    int c=0;
    while(j<s.length()){
        if(s.charAt(j)!=' '){
            j++;
        }else{
            c++;
            i=j+1;
            j=i;
        }
    }    
    return c+1;
    }
    public int mostWordsFound(String[] arr) {
    int c=-1;
    for(int i=0; i<arr.length; i++){
        c=Math.max(fun(arr[i]),c);
    }   
    return c;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna