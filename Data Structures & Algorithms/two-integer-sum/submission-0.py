class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        differenceMap={}
        
        for i in range(0,len(nums)):
            num=nums[i]
            if num in differenceMap.keys():
                return [differenceMap[num][0],i]
            else:
                difference=target-num
                if difference in differenceMap.keys():
                    differenceMap[difference].append(i)
                else:
                    differenceMap[difference]=[i]
        
