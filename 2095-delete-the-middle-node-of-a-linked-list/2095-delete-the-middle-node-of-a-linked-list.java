class Solution {
    public ListNode deleteMiddle(ListNode head) {
    if(head.next==null) return null;
    ListNode slow=head;
    ListNode fast=head;
    while(fast.next.next!=null && fast.next.next.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    slow.next=slow.next.next;
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna