class Solution {
    public int pivotIndex(int[] nums) {

        ArrayList<Integer> prefixsum=new ArrayList<Integer>();
        int curr=0;
        for(int num:nums){
            curr=curr+num;
            prefixsum.add(curr);
        }
        for(int i=0;i<prefixsum.size();i++)
        {
            int leftsum=i>0?prefixsum.get(i-1):0;
            int rightsum=(i==prefixsum.size()-1)? 0:(prefixsum.get(prefixsum.size()-1)-prefixsum.get(i));
            if(leftsum==rightsum)
            {
                return i;
            }
        }
        return -1;
        
    }
}