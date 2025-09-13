
class Solution {
    public int removeElement(int[] nums, int val) {
        int s=nums.length;
        int p=0;
        for(int i=0;i<s;i++){
            if(nums[i]!=val){
                nums[p++]=nums[i];
            }
        }
        return p;
    }
}
