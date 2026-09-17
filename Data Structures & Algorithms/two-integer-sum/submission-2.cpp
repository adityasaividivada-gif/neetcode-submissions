class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        
        unordered_map<int,vector<int>> hw;
        for(int i=0;i<nums.size();i++)
        {
            if(hw.count(nums[i])==1)
            {
                return {hw[nums[i]][0],i};
            }
            else{
                int difference=target-nums[i];
                hw[difference].push_back(i);
            }
        }
        return {};

    }
};
