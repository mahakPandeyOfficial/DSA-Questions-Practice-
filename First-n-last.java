/* Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity. 
*/


//Solution class 
//main class is not there this is only solution.

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};

        //for first iteration search 
        int si = 0 , ei = nums.length-1;
        int mid = si+(ei-si)/2;
        while(si <= ei){
            mid = si + (ei-si)/2;

            if(target == nums[mid]){
                ans[0] = mid;
                ei = mid-1;
            }
            else if(target < nums[mid]){
                ei = mid - 1;
            }
            else if(target > nums[mid]){
                si = mid + 1;
            }
        }

        //for second iteration search 
        si = 0 ;
        ei = nums.length - 1;
      while(si <= ei){
            mid = si + (ei-si)/2;

            if(target == nums[mid]){
                ans[1] = mid;
                si = mid + 1;
            }
            else if(target < nums[mid]){
                ei = mid - 1;
            }
            else if(target > nums[mid]){
                si = mid + 1;
            }
        }
     return ans;
    }
}