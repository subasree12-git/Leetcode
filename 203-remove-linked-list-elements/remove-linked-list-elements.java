class Solution 
{
    public ListNode removeElements(ListNode head, int target) 
    {
        if(head==null)
           return head;
        ListNode prev=head;
        ListNode temp=head.next;
        while(temp!=null)
        {
            if(temp.val==target)
            {
                prev.next=temp.next;
                temp=temp.next;
            }
            else
            {
                prev=temp;
                temp=temp.next;
            }
        }
        if(head.val==target)
           head=head.next;
        return head;        
    }
}