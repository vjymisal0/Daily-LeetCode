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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        TreeSet<Integer> set = new TreeSet<>();
        ListNode prev= head;
        head= head.next;
        int i = 2;
        while(head!=null && head.next!=null){
            if (head.val < prev.val && head.val < head.next.val){
                set.add(i);
            }else if (head.val > prev.val && head.val > head.next.val){
                set.add(i);
            }
            prev = head;
            head = head.next;
            i++;
        }
        if (set.size() < 2){
            return new int[]{-1,-1};
        }
        int[] ans = new int[2];
        Iterator<Integer> itr = set.iterator();
        int first = itr.next();
        int next = itr.next();
        ans[0]=next-first;
        ans[1]=next-first;
        int pVal = next;
        while(itr.hasNext()){
            next = itr.next();
            ans[0]=Math.min(ans[0], next - pVal);
            pVal= next;
        }
        ans[1]=Math.max(ans[1], next-first);

        return ans; 
    }
}