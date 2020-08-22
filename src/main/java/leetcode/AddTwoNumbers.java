package leetcode;

public class AddTwoNumbers {

    public static void main(String[] args) {
          solution();
    }
    public static void solution() {
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode pointer = sum;
        int carry = 0;

        while(l1 != null || l2 != null) {
            int x = l1 != null ? l1.val: 0;
            int y = l2 != null ? l2.val: 0;
            int total = x + y + carry;
            carry = total / 10;
            pointer.next = new ListNode(total % 10);
            pointer = pointer.next;
            l1 = l1 != null ? l1.next: l1;
            l2 = l2 != null ? l2.next: l2;
        }
        if(carry != 0) pointer.next = new ListNode(carry);

        return sum.next;

    }
}