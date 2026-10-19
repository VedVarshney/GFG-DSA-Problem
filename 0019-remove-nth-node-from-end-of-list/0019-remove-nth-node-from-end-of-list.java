class Solution {
    public ListNode removeNthFromEnd(ListNode head, int k) {
    int len=0;
    ListNode temp=head;
    while(temp!=null){
        temp=temp.next;
        len++;
    }   
    if(k==len) return head.next;
    temp=head;
    for(int i=0; i<len-k-1; i++){
       temp=temp.next;
    }
    temp.next=temp.next.next;
    return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna