class Solution {
    public int removeDuplicates(int[] nums) {
        int s=nums.length;
        int p=0;
        int i=1;
        while(i<s){
            if(nums[i]==nums[p]){
                i++;
            }
            else{
                nums[++p]=nums[i++];
            }
        }
        return ++p;
    }
}
