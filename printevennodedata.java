import java.util.*;
public class printevennodedata{
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
    public void printeven(ListNode head)
    {
        ListNode temp=head;
        int i=0;
        while(temp!=null)
        {
            if(i%2!=0)
            {
                 System.out.print(temp.val+" ");
            }
            temp=temp.next;
            i++;
        }
      
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
     printevennodedata t=new printevennodedata();
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
      System.out.print(t.size(dummy.next));
       t.printeven(dummy.next);
    }
}