class Solution
{
    public ListNode middleNode(ListNode head)
    {
        ListNode fast=head;
        ListNode slow=head;
        while(slow!=null && slow.next!=null)
        {
            fast=fast.next;
            slow=slow.next.next;
        }
        return fast;
    }
}