class mergeTwoSortedLists {
    //Function to find the minimum element in sorted and rotated array.
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode resulthead=null;
        ListNode resultTail=null;
        ListNode curr = list1;
        ListNode curr2 = list2;
        if(curr==null || curr2==null){

            if(curr==null && curr2==null){
                return null;
            }
            else if(curr!=null){
                resulthead = new ListNode(curr.val);
                resultTail= resulthead;
                curr=curr.next;
                while (curr != null) {
                    resultTail.next = new ListNode(curr.val);
                    curr = curr.next;
                    resultTail = resultTail.next;
                }
            }
            else{
                resulthead = new ListNode(curr2.val);
                resultTail= resulthead;
                curr2=curr2.next;
                while (curr2 != null) {
                    resultTail.next = new ListNode(curr2.val);
                    curr2 = curr2.next;
                    resultTail = resultTail.next;

                }
            }
        }

        if (curr != null) {
            if (curr.val < curr2.val) {
                resulthead = new ListNode(curr.val);
                resultTail = resulthead;
                curr = curr.next;
            } else if (curr.val > curr2.val) {
                resulthead = new ListNode(curr2.val);
                resultTail = resulthead;
                curr2 = curr2.next;
            } else {
                resulthead = new ListNode(curr.val);
                resultTail = new ListNode(curr.val);
                resulthead.next = resultTail;
                curr = curr.next;
                curr2 = curr2.next;

            }
        }

        while (curr != null && curr2 != null) {
            if (curr.val < curr2.val) {
                resultTail.next = new ListNode(curr.val);
                curr = curr.next;
                resultTail = resultTail.next;
            } else if (curr.val > curr2.val) {
                resultTail.next = new ListNode(curr2.val);
                curr2 = curr2.next;
                resultTail = resultTail.next;
            } else {
                resultTail.next = new ListNode(curr.val);
                resultTail = resultTail.next;
                resultTail.next = new ListNode(curr2.val);
                curr = curr.next;
                curr2 = curr2.next;
                resultTail = resultTail.next;
            }

        }
        while (curr != null) {
            resultTail.next = new ListNode(curr.val);
            curr = curr.next;
            resultTail = resultTail.next;
        }
        while (curr2 != null) {
            resultTail.next = new ListNode(curr2.val);
            curr2 = curr2.next;
            resultTail = resultTail.next;

        }
        return resulthead;
    }

    public static void main(String str[]) throws Exception {
        ListNode list1a = new ListNode(1);
//        list1a.next = new ListNode(2);
//        list1a.next.next = new ListNode(3);
//        ListNode list2a = new ListNode(1);
        ListNode list2a =null;
//        list2a.next = new ListNode(3);
//        list2a.next.next = new ListNode(4);

        System.out.println(mergeTwoLists(list1a, list2a));

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


