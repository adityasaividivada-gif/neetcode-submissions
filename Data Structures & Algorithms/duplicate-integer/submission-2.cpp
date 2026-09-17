class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int,int> hm;
        for(int num:nums)
        {
            if(hm.count(num)==0)
            {
                hm[num]=1;
            }
            else{
                return true;
            }
        }
        return false;
    }
};