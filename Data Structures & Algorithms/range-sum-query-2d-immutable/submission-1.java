class NumMatrix {

    ArrayList<ArrayList<Integer>> prefixsum=new ArrayList<ArrayList<Integer>>();
    public NumMatrix(int[][] matrix) {
        for(int[] arr:matrix)
        {
            ArrayList<Integer> subprefix=new ArrayList<>();
            int curr=0;
            for(int num:arr)
            {
                curr=curr+num;
                subprefix.add(curr);
            }
            this.prefixsum.add(subprefix);
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int outputsum=0;
        for(int i=row1;i<=row2;i++)
        {
            int leftsum=col1>0?this.prefixsum.get(i).get(col1-1):0;
            int rightsum=this.prefixsum.get(i).get(col2);
            outputsum=outputsum+(rightsum-leftsum);
        }
        return outputsum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */