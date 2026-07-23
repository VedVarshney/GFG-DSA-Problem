class Solution {
    public ListNode deleteDuplicates(ListNode head) {
    if(head==null || head.next==null)
    return head;
    ListNode a=head;
    ListNode b=head;
    while(b!=null){
        if(a.val==b.val)
        b=b.next;
        else{
            a.next=b;
            a=b;
        }
    }    
    a.next=b;
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna