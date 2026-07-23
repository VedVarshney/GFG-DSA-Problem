class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    if(head==null || head.next==null)
    return head;
    ListNode slow=head;
    ListNode fast=head;
    int n=0;
    while(fast!=null){
        fast=fast.next;
        n++;
    }
    k=k%n;
    if(k==0)
    return head;
    fast=head;
    for(int i=0; i<k; i++){
        fast=fast.next;
    }   
    while(fast.next!=null){
    slow=slow.next;
    fast=fast.next;
    }
    ListNode newHead=slow.next;
    slow.next=null;
    fast.next=head;
    return newHead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna