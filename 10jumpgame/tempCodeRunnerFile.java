class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int step=0;
        int max =0;
        int cmax=0;
        for(int i=0;i<n-1;i++){
            if(i+nums[i]>max){
                max=i+nums[i];
            }
            if(i==cmax){
                step++;
                cmax=max;
            }
        }
        return step;
    }
}
