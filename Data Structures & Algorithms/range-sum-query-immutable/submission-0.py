class NumArray:

    def __init__(self, nums: List[int]):
        self.nums=nums
        self.presum=[]
        for num in nums:
            if len(self.presum)==0:
                self.presum.append(num)
            else:
                self.presum.append(self.presum[-1]+num)
        print(self.presum)
        
    def sumRange(self, left: int, right: int) -> int:
        

        leftsum=self.presum[left-1] if left>0 else 0
        rightsum=self.presum[right]
        
        return rightsum-leftsum



# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)