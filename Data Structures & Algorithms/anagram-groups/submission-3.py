class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = {}
        for i in strs:
            lista = [0] * 26
            for c in i:
                lista[ord(c) - ord("a")] += 1
            key = tuple(lista)
            if key not in res:
                res[key] = []
            res[key].append(i)
        return list(res.values())