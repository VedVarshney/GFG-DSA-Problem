class Solution {
    public ListNode deleteMiddle(ListNode head) {
    if(head.next==null) return null;
    ListNode temp=head;
    int len=0;
    while(temp!=null){
        temp=temp.next;
        len++;
    }    
    temp=head;
    for(int i=1; i<len/2; i++){
        temp=temp.next;
    }
    temp.next=temp.next.next;
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna