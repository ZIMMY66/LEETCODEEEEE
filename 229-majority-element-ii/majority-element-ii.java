class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int cnt1 = 0;
        int cnt2 = 0;

        int el1 = 0;
        int el2 = 0;

        // Step 1: Find possible candidates
        for (int num : nums) {

            if (cnt1 == 0 && num != el2) {
                el1 = num;
                cnt1 = 1;
            }

            else if (cnt2 == 0 && num != el1) {
                el2 = num;
                cnt2 = 1;
            }

            else if (num == el1) {
                cnt1++;
            }

            else if (num == el2) {
                cnt2++;
            }

            else {
                cnt1--;
                cnt2--;
            }
        }

        // Step 2: Verify the candidates
        cnt1 = 0;
        cnt2 = 0;

        for (int num : nums) {
            if (num == el1) {
                cnt1++;
            }
            else if (num == el2) {
                cnt2++;
            }
        }

        // Store valid majority elements
        List<Integer> ans = new ArrayList<>();

        if (cnt1 > nums.length / 3) {
            ans.add(el1);
        }

        if (cnt2 > nums.length / 3) {
            ans.add(el2);
        }

        return ans;
    }
}