/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr=head;
        ListNode nnext;
        ListNode temp = head;
        while(temp.next!=null){
            nnext = curr.next;
            int a= curr.val;
            int b = nnext.val;
            while(b!=0){
                int temp1 = b;
                b=a%b;
                a = temp1;
            }
            temp=temp.next;
            ListNode nn = new ListNode(a);
            nn.next = curr.next;
            curr.next = nn;
            curr = nnext;
        }
        return head;
    }
}