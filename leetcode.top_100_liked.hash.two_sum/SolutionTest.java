import java.util.Arrays;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(ints));
    }
}
