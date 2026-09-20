class NumArray {

    ArrayList<Integer> prefixsum=new ArrayList<Integer>();

    public NumArray(int[] nums) {
        int curr=0;
        for(int num:nums){
            curr=curr+num;
            this.prefixsum.add(curr);
        }
    }
    
    public int sumRange(int left, int right) {

        int leftsum=left>0? this.prefixsum.get(left-1):0;
        int rightsum=this.prefixsum.get(right);
        return rightsum-leftsum;
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */