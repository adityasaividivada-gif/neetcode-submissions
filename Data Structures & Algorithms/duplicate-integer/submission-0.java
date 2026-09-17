class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int number:nums)
        {
            if(hm.containsKey(number))
            {
                return true;
            }
            else{
                hm.put(number,1);
            }
        }
        return false;
        
    }
}