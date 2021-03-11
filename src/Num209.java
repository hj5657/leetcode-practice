public class Num209 {

  public int minSubArrayLen(int target, int[] nums) {
    int sum = 0, left = 0, right = 0, min = Integer.MAX_VALUE;
    boolean flag = false;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      right = i;
      while (sum >= target) {
        flag = true;
        min = Math.min(min, right - left + 1);
        sum -= nums[left];
        left++;
      }
    }
    if (flag) {
      return min;
    }
    return 0;
  }

}
