class Solution {
    public int removeDuplicates(int[] nums) {
        int first=0;
        
        for(int second=0;second<nums.length;second++)
        {
            if(nums[first]==nums[second])
            {
                continue;
            }
            else{
                nums[++first]=nums[second];
            }
        }
        return first+1;
    }
}