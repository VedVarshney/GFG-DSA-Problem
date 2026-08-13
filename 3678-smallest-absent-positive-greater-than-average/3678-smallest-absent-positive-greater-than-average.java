class Solution {
    public int smallestAbsent(int[] arr) {
    HashSet<Integer> set = new HashSet<>();
    int sum=0;
    for(int i=0; i<arr.length; i++){
        sum+=arr[i];
        set.add(arr[i]);
    }
    int av=sum/arr.length;
    int i=av+1;
    if(av<0) i=1;
    while(i>0){
        if(!set.contains(i))
        return i;
        i+=1;
    }
    return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna