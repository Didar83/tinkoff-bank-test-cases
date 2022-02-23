package com.leetcode.level.easy;

public class MergeTwoSortedList {



    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        ListNode mergedList = new ListNode();
        if(list1.val < list2.val){
            mergedList = list1;
            mergedList.next = mergeTwoLists(list1.next, list2);
        } else {
            mergedList = list2;
            mergedList.next = mergeTwoLists(list1, list2.next);
        }
        return mergedList;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();
        for (int i = 0; i < 3; i++){
            l3.next = l3;
            l3.val = i;
            l1 = l3;
            l2 = l3;
        }
        while(l2 != null){
            System.out.println(l2.val);
            l2 = l2.next;
        }
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
