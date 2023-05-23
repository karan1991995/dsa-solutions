class deletedupNodes {
    //Function to find the minimum element in sorted and rotated array.
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }

    public static void main(String str[]) throws Exception {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(1);
        l1.next.next.next = new ListNode(1);
        l1.next.next.next.next = new ListNode(1);
        System.out.println(deleteDuplicates(l1));
    }


}
