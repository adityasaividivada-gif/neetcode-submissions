class Solution {
    public int maxArea(int[] heights) {

        int first=0;
        int last=heights.length-1;
        int maxArea=0;
        while(first<last)
        {
            int area=Math.min(heights[first],heights[last])*(last-first);
            
            if(area>maxArea){
                maxArea=area;
            }
            if(heights[first]<heights[last])
            {
                first++;
            }
            else{
                last--;
            }
        }
        return maxArea;        
    }
}
