class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:


        res = {}
        for word in strs:
            lista = [0]* 26
            for i in word:
                lista[ord(i) - ord("a")] +=1
            tuplea = tuple(lista)

            if tuplea not in res:
                res[tuplea] = []
            res[tuplea].append(word)
        return list(res.values())