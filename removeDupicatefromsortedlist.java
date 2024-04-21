import java.util.*;
public class removeDupicatefromsortedlist{
    public  class ListNode{
        int val;
        ListNode next;
        public ListNode(int val)
        {
            this.val=val;
        }
}
public int size(ListNode head)
{
    int c=0;
    while(head.next!=null)
    {
     c++;
     head=head.next;
    }
    return c;
}

      public  ListNode deleteDuplicates(ListNode head) {
        ListNode current=head;
         while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
    public void print(ListNode head)
    {
        ListNode temp=head;
          System.out.println();
        while(temp!=null)
        {
            System.out.print(temp.val+" ");
            
            temp=temp.next;
        }
      
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
      removeDupicatefromsortedlist t=new removeDupicatefromsortedlist();
      ListNode dummy =t.new ListNode(-1),ans=dummy;
        // while(sc.hasNext())
        // {
        //   ans.next=t.new ListNode(sc.nextInt());
        //   ans=ans.next;
        // }
        int n=sc.nextInt();
        while(n-->0)
        {
          ans.next=t.new ListNode(sc.nextInt());
          ans=ans.next;
        }
     ans= t.deleteDuplicates(dummy.next);
      System.out.print(t.size(dummy.next));
       t.print(ans);
    }
}