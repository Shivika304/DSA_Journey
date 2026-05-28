class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        cnt=0
        c=0
        n=len(nums)
        for i in nums:
            if i==1:
                c+=1
                cnt=max(cnt,c)
            else:
                c=0
        return cnt
            