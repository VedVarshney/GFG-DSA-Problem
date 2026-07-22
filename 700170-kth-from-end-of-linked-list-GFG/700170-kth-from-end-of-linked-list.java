class Solution {
    public int getKthFromLast(Node head, int k) {
    Node fast=head;
    for(int i=0; i<k; i++){
        if(fast==null)
        return -1;
        fast=fast.next;
    }
    if(fast==null)
    return head.data;
    Node slow=head;
    while(fast!=null){
        slow=slow.next;
        fast=fast.next;
    }
    return slow.data;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna