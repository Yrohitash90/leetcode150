class Solution {
    public int removeDuplicates(int[] nums) {
        int s=nums.length;
        int p=2;
        for(int i=2;i<s;i++){
            if(nums[i]!=nums[p-2]){
                nums[p]=nums[i];
                p++;
            }
        }
        return p;
    }
}
