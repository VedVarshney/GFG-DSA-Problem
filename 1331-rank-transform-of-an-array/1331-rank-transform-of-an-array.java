class Solution {
    public int[] arrayRankTransform(int[] arr) {
    int[] srr=Arrays.copyOf(arr,arr.length);
    HashMap<Integer,Integer> map = new HashMap<>();
    Arrays.sort(srr);
    int r=1;
    for(int i=0; i<srr.length; i++){
    if(!map.containsKey(srr[i]))
       map.put(srr[i],r++);
    }
    for(int i=0; i<arr.length; i++){
        arr[i]=map.get(arr[i]);
    }
    return arr;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna