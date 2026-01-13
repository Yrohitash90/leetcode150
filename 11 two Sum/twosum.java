import java.util.*;
public class twosum{
    public static int[] TwoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = target - nums[i];
            if(map.containsKey(num)){
                return new int[] {map.get(num),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String []args){
        int list[]={2,7,9,11};
        int target=9;
        int l[]=TwoSum(list, target);
        System.out.println(Arrays.toString(l));
    }
}

