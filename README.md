# Merge-K-Sorted-Lists（合并K个排序链表）
合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。

## Sample
输入:
[  
  1->4->5,  
  1->3->4,  
  2->6  
]  
输出: 1->1->2->3->4->4->5->6  

## Solution
分治法求解
将K个链表配对并将同一对中的链表合并。
第一轮合并以后，K个链表被合并成了K/2个链表，平均长度为2N/K，然后是K/4个链表，K/8个链表等等。  
重复这一过程，直到得到了最终的有序链表。  
因此，在每一次配对合并的过程中都会遍历几乎全部N个节点，并重复这一过程logK次。

## 复杂度分析
时间复杂度：O(NlogK)，其中K是链表的数目。可以在O(N)时间内合并两个有序链表，其中N是两个链表中的总节点数。重复这个过程logK次，可得O(NlogK)  
空间复杂度：O(1)。可以用O(1)的空间实现两个有序链表的合并。  

## 备注
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/merge-k-sorted-lists
