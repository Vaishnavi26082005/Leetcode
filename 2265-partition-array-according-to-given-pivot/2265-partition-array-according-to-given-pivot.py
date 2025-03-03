class Solution:
    def pivotArray(self, nums: List[int], pivot: int) -> List[int]:
        lc=0
        gc=0
        eq=0
        for i in nums:
            if i<pivot:
                lc+=1
            elif i==pivot:
                eq+=1
            else:
                gc+=1       
        res=[0]*len(nums)
        m=0
        j=lc
        k=lc+eq
        for i in nums:
            if i<pivot:
                res[m]=i
                m+=1
            elif i==pivot:
                res[j]=i
                j+=1
            else:
                res[k]=i
                k+=1
        return res


