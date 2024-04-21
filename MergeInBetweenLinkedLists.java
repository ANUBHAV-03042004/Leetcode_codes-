class MergeInBetweenLinkedLists {
    public static class ListNode {
     int val;
    ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
      if(list1==null) return list2;
      if(list2==null) return list1;
      ListNode temp=list1,tem=list1;
      if(list1.next==null)
      {
        list1.next=list2;
      }
        for(int i=0;i<a-1;i++)
        {
            tem=tem.next;
        }
      
        for(int i=0;i<b+1;i++)
        {
temp=temp.next;
        }
         tem.next=list2;
       while(list2.next!=null)
       {
        list2=list2.next;
       }
       list2.next=temp;

       return list1;
    }
    public static void display(ListNode list1)
    {
        ListNode temp=list1;
        while(temp.next!=null)
        {
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
       ListNode list1 = new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
ListNode list2 = new ListNode(1000000, new ListNode(1000001, new ListNode(1000002, new ListNode(1000003, new ListNode(1000004)))));

        int a=3,b=4;
        mergeInBetween(list1, a, b, list2);
        display(list1);
    }

}