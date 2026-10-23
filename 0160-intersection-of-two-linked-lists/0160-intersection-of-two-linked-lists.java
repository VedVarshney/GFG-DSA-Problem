public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode a=headA;
    ListNode b=headB;
    int l1=0,l2=0;
    while(a!=null){
        a=a.next;
        l1++;
    }    
    while(b!=null){
        b=b.next;
        l2++;
    } 
    a=headA;
    b=headB;
    if(l2>l1){
    for(int i=0; i<l2-l1; i++){
        b=b.next;
    }
    }else{
    for(int i=0; i<l1-l2; i++){
        a=a.next;
    }
    }
    while(a!=b){
        a=a.next;
        b=b.next;
    }
    return a;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna