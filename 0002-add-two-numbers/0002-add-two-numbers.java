class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(-1);
    ListNode k=dummy;  
    int carry=0;
    while(l1!=null && l2!=null){
    int sum=l1.val+l2.val+carry;
    carry=sum/10;
    k.next=new ListNode(sum%10);    
    l1=l1.next;
    l2=l2.next;
    k=k.next;
    }
    while(l1!=null){
        int sum=l1.val+carry;
        carry=sum/10;
        k.next=new ListNode(sum%10);
        l1=l1.next;
        k=k.next;
    }
    while(l2!=null){
        int sum=l2.val+carry;
        carry=sum/10;
        k.next=new ListNode(sum%10);
        l2=l2.next;
        k=k.next;
    }
    if(carry!=0){
        k.next=new ListNode(carry);
    }
    return dummy.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna