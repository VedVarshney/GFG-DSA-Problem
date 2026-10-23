class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode slow=head;
    ListNode fast=head;
    for(int i=0; i<n-1; i++){
        fast=fast.next;
    }   
    if(fast.next==null) return head.next; 
    while(fast.next.next!=null){
        slow=slow.next;
        fast=fast.next;
    }
    slow.next=slow.next.next;
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna