class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int target=k*threshold;
        int left=0;
        int slidingSum=0;
        int output=0;
        for(int right=0;right<arr.length;right++){
            if(right-left+1 > k){
                slidingSum=slidingSum-arr[left];
                left++;
            }
            
            slidingSum=slidingSum+arr[right];
            if(slidingSum>=target && (right-left+1)==k){
                output=output+1;
            }

        }
        return output;
    }
}