import java.util.*;
public class countevennodedata{
    public  class ListNode{
        int val;
        ListNode next;
        public ListNode(int val)
        {
            this.val=val;
        }
}
    public void counteven(ListNode head)
    {
        ListNode temp=head;
        int i=0;
        while(temp!=null)
        {
            if(temp.val%2==0)
            {
                 System.out.println(temp.val+" "+i);
            }
            temp=temp.next;
            i++;
        }
      
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    countevennodedata t=new countevennodedata();
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
       t.counteven(dummy.next);
    }
}