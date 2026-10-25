class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
    Stack<Integer> s = new Stack<>();
    int size=q.size();
    if(k>size) return q;
        for(int i=0; i<k; i++){
            s.push(q.remove());
        }
        while(s.size()>0){
            q.add(s.pop());
        }
        for(int i=0; i<size-k; i++){
            q.add(q.remove());
        }
        return q;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna