class Solution {
    public int majorityElement(int[] nums) {

        int cnt = 0;
        int el = 0;

        // STEP 1: Find candidate
        for(int i = 0; i < nums.length; i++) {

            if(cnt == 0) {
                el = nums[i];
                cnt = 1;
            }
            else if(nums[i] == el) {
                cnt++;
            }
            else {
                cnt--;
            }
        }

        // STEP 2: Verify candidate
        int cnt1 = 0;

        for(int j = 0; j < nums.length; j++) {

            if(nums[j] == el) {
                cnt1++;
            }
        }

        if(cnt1 > nums.length / 2) {
            return el;
        }

        return -1;
    }
}