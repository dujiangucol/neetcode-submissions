# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

  
import heapq
from typing import List, Optional

class Solution:
    def mergeKLists(
        self,
        lists: List[Optional[ListNode]]
    ) -> Optional[ListNode]:

        heap = []

        # Put the head of every non-empty list into the heap
        for index, node in enumerate(lists):
            if node:
                heapq.heappush(heap, (node.val, index, node))

        dummy = ListNode()
        tail = dummy

        while heap:
            value, index, node = heapq.heappop(heap)

            # Attach the smallest node
            tail.next = node
            tail = tail.next

            # Add the next node from the same linked list
            if node.next:
                heapq.heappush(
                    heap,
                    (node.next.val, index, node.next)
                )

        return dummy.next