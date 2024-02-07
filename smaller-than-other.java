/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
*/

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count=0;
        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums.length ; j++){
                if(i != j){
                    if(nums[i]>nums[j]){
                     count++;

                    }
                }
            }
             ans[i] = count;
                count = 0;
        }

        return ans;
    }
}
