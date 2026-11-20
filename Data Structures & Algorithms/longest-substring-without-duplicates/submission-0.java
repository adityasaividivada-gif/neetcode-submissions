class Solution {
    public int lengthOfLongestSubstring(String s) {
        int returnLength=Integer.MIN_VALUE;
        HashSet<Character> set=new HashSet<Character>();
        int left=0;
        for(int right=0;right<s.length();right++){
            if(set.contains(s.charAt(right))){
                while(s.charAt(left)!=s.charAt(right)){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.remove(s.charAt(left));
                left++;
                set.add(s.charAt(right));
            }
            else{
                set.add(s.charAt(right));
            }
            returnLength=Math.max(returnLength,right-left+1);
        }
        return returnLength==Integer.MIN_VALUE? 0:returnLength;
    }
    
}