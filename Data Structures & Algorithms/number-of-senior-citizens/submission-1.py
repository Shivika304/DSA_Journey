class Solution:
    def countSeniors(self, details: List[str]) -> int:
        cnt=0
        for p in details:
            s=int(p[11:13])
            if s>60:
                cnt+=1
        return cnt