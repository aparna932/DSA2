public class Solution {
    public ListNode detectCycle(ListNode head) {
       ListNode slow = head;
       ListNode fast = head;
       ListNode entry = head;
       while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast){
            break;
        }
        }
        if(fast == null || fast.next == null){
            return null;
        }
        while(slow != entry){
            entry = entry.next;
            slow = slow.next;
        }
        return entry;
    }
    
}