class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int cnt=0;
        int maxii=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                cnt++;
            }
            else{
                cnt=0;
            }
            maxii=Math.max(maxii,cnt);
        }
        return maxii;
    }
}