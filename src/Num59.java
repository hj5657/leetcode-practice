public class Num59 {

  public int[][] generateMatrix(int n) {
    int goal[][] = new int[n][n];
    int num = 1, l = 0, r = n - 1, t = 0, b = n - 1;
    while (num <= n * n) {
      for (int i = l; i <= r; i++) {
        goal[t][i] = num++;
      }
      t++;
      for (int i = t; i <= b; i++) {
        goal[i][r] = num++;
      }
      r--;
      for (int i = r; i >= l; i--) {
        goal[b][i] = num++;
      }
      b--;
      for (int i = b; i >= t; i--) {
        goal[i][l] = num++;
      }
      l++;
    }
    return goal;
  }
}
