class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                return new int[]{hm.get(nums[i]).get(0),i};
            }
            else
            {
                int difference=target-nums[i];
                if(hm.containsKey(difference))
                {
                    hm.get(difference).add(i);
                }
                else{
                    hm.put(difference,new ArrayList<Integer>(List.of(i)));
                }
            }
        }
        return new int[]{};
        
    }
}
