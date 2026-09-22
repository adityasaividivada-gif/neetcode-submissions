class Solution {
    public int removeDuplicates(int[] nums) {

        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        int first=-1;
        for(int second=0;second<nums.length;second++)
        {
            if(hm.containsKey(nums[second]))
            {
                if(hm.get(nums[second])<2)
                {
                    hm.put(nums[second],hm.get(nums[second])+1);
                    nums[++first]=nums[second];
                }
            }
            else{
                hm.put(nums[second],1);
                nums[++first]=nums[second];
            }
        }
        
        return first+1;
        
    }
}