package array;

class Num27 {

  public int removeElement(int[] nums, int val) {
    int cnt = nums.length;
    for (int i = 0; i < nums.length; ) {
      if (nums[i] == val) {
        cnt--;
        for (int j = i; j < nums.length; j++) {
          if (j >= nums.length - 1) {
            nums[j] = val - 1;
            break;
          }
          nums[j] = nums[j + 1];
        }
      } else {
        i++;
      }
    }
    return cnt;
  }

  /**
   * 更好的解法
   *
   * @param nums
   * @param val
   * @return
   */
  public int removeElement2(int[] nums, int val) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i]!=val){
        nums[j]=nums[i];
        j++;
      }
    }
    return j;
  }
}

