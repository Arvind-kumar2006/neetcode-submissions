class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int curr = 0;
        ListNode newHead = new ListNode(0);
        ListNode temp = newHead;
        while(l1!=null || l2!=null){
            int sum = curr;

            if(l1!=null){
                sum+=l1.val;
                l1 = l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2 = l2.next;
            }
            curr = sum/10;
            ListNode newNode = new ListNode(sum%10);
            temp.next = newNode;
            temp = temp.next;
        }

       if (curr > 0) {

    temp.next = new ListNode(curr);

}
            return newHead.next;
    }
}
