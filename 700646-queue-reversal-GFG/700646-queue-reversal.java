class Solution {
    public void reverseQueue(Queue<Integer> q) {
    Stack<Integer> s = new Stack<>();
       while(q.size()>0){
       s.push(q.remove());
       }
       while(s.size()>0){
       q.add(s.pop());
       }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna