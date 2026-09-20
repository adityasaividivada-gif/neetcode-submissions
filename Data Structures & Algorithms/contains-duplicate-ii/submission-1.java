class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        int left=0;
        HashSet<Integer> hash=new HashSet<Integer>();
        for(int right=0;right<nums.length;right++)
        {
            if((right-left)>k){
                hash.remove(nums[left]);
                left++;
            }
            if(hash.contains(nums[right])){
                return true;
            }
            hash.add(nums[right]);
            
        }
        return false;
        
    }
}