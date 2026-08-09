
class Solution {
    public int getCount(Node head) {
    int n=0;
    while(head!=null){
        head=head.next;
        n++;
    }
    return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna