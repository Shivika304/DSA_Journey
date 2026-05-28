class Solution:
    def findLucky(self, arr: List[int]) -> int:
        freq= {}
        for i in arr:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
        res=-1
        for key,value in freq.items():
            if key==value:
                res=max(res,key)

        return res