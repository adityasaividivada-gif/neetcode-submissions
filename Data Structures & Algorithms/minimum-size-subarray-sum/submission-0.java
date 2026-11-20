class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int returnlength=Integer.MAX_VALUE;
        int total=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            total=total+nums[right];
            while(total>=target){
                returnlength=Math.min(right-left+1,returnlength);
                total=total-nums[left];
                left++;
            }
        }

        return returnlength==Integer.MAX_VALUE? 0:returnlength;
    }
}