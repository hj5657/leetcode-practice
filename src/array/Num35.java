package array;

class Num35 {

  public int searchInsert(int[] nums, int target) {
    int right = nums.length - 1;
    int left = 0;
    while (left <= right) {
      int mid = (right - left) / 2 + left;
      if (nums[mid] > target) {
        right = mid - 1;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        return mid;
      }
    }
    return left;
  }
}
