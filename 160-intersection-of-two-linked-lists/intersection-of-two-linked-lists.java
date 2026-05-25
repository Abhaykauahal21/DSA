/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        //Aproch 1
        ListNode currA = headA;
        ListNode currB = headB;

        // HashSet<ListNode> set = new HashSet<>();

        // while(currA != null){
        //     set.add(currA);
        //     currA = currA.next;
        // }
        
        // while(currB !=  null){
        //     if(set.contains(currB)){
        //         return currB;
        //     }
        //     set.add(currB);
        //     currB = currB.next;
        // }

        // return null;

        // Approch 2

        while(currA != currB){
            currA = currA == null ? headB : currA.next;
            currB = currB == null ? headA : currB.next;
        }

        return currA;
    }
}