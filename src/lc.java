import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class lc {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new lc().twoSum(new int[]{2, 7, 11, 15}, 26)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i<nums.length; i++){

            if (map.get(i) != null){
                index1 = map.get(i);
                index2 = i;
                return new int[]{index1,index2};
            }else {
                map.put(target - nums[i], i);
            }
        }
        return new int[]{index1,index2};
    }

}
