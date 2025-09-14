class Solution {
    public boolean canJump(int[] nums) {
        int power=0;
        for(int i=0;i<nums.length;i++){
            if(power>=i){
                int npower=i+nums[i];
                if(npower>power){
                    power=npower;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}