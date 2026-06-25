class Solution:
    def isValid(self, s: str) -> bool:


        stack = []
        dicta = {"}":"{", ")":"(","]":"["}
        for c in s:
            if c in dicta:
                if stack and stack[-1] == dicta[c]:
                    stack.pop()
                else:
                    return False
                
            else:
                stack.append(c)
        return True if not stack else False