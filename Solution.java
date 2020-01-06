class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length <= 0) {
            return null;
        }

        int len = lists.length;
        if (len == 1) {
            return lists[0];
        }

        ListNode all = mergeLists(lists, 0, len - 1);
        return all;
    }

    private ListNode mergeLists(ListNode[] lists, int left, int right) {
        ListNode all = null;
        if (right - left == 1) {
            return mergeTwoLists(lists[left], lists[right]);
        } else if (right == left) {
            return lists[left];
        } else {
            int mid = (left + right) / 2;
            ListNode l = mergeLists(lists, left, mid);
            ListNode r = mergeLists(lists, mid + 1, right);
            all = mergeTwoLists(l, r);
        }

        return all;
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
