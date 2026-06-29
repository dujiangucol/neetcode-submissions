# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:

    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        arr = []
        self.dfs(root, arr)
        return arr[k - 1]

    def dfs(self, node, arr):
        if not node:
            return

        self.dfs(node.left, arr)
        arr.append(node.val)
        self.dfs(node.right, arr)
        