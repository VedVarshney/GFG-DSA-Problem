class Solution {
    public int moreFrequent(List<Integer> arr, int x, int y) {
    int xf=0,yf=0;
    for(int i=0; i<arr.size(); i++){
        if(arr.get(i)==x)
        xf++;
        else if(arr.get(i)==y)
        yf++;
    }
    if(xf>yf)
    return x;
    else if(yf>xf)
    return y;
    else {
        if(x<y)
        return x;
        else
        return y;
    }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna