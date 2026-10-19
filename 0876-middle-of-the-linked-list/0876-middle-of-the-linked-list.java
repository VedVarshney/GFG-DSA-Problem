class Solution {
    public ListNode middleNode(ListNode head) {
    ListNode temp=head;
    int len=0;
    while(temp!=null){
        temp=temp.next;
        len++;
    } 
    temp=head;  
    for(int i=0; i<len/2; i++){
        temp=temp.next;
    }
    return temp;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna