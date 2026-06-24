class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!= len(t):
            return False
        dica ={}
        dicb = {}

        for i in s:
            if i in dica:
                dica[i] +=1
            else:
                dica[i] = 0
        for j in t:
            if j in dicb:
                dicb[j]+=1
            else:
                dicb[j] = 0
        
        return dica == dicb