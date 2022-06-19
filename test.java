class ListNode {
    int value;
    ListNode next;
    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
};

public class Solution {
    static public ListNode reverseLinkedList(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode dummyHead = head;
        ListNode prev = null;
        while(dummyHead.next != null) {
            System.out.println("dummyhead value:" + dummyHead.next.value);
            ListNode temp = dummyHead.next;
            dummyHead.next = prev;
            prev = dummyHead;
            dummyHead = temp;
            // System.out.println("prev value:" + prev.value);
        }
        return dummyHead;
    }
<<<<<<< HEAD
    // 2-> 3-> 4 -> 5->  null
=======
    // 1-> 2-> 3-> 4 -> null
>>>>>>> da9129c0d4ab12dd5e744ffbae4ce35351473049
    public static void main(String [] args) {
        ListNode head = new ListNode(2);
        ListNode dummyHead = head;
        ListNode printHead = head;
        head.next = new ListNode(3);
        head = head.next;
        head.next = new ListNode(4);
        head = head.next;
        
        System.out.println("DummyHead : "+ dummyHead.value);

    	
        while(printHead != null) {
            System.out.print(printHead.value + "->");
            printHead = printHead.next;
        }
        System.out.println();

        ListNode reverseHead = reverseLinkedList(dummyHead);
        System.out.println("DummyHead : "+ dummyHead.value);
        System.out.println("DummyHead Next: "+ dummyHead.next.value);
        System.out.println("|ReverseHead : "+ reverseHead.value);
    }
}
