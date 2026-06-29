# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:

        p = deque()
        ans = []
        p.append(root)

        while p:
            plen = len(p)
            level = []
            for i in range(len(p)):
                node = p.popleft()
                if node:
                    level.append(node.val)
                    p.append(node.left)
                    p.append(node.right)
            
            if level:
                ans.append(level)
        
        return ans
















