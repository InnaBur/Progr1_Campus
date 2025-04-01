package Part4;

public class EinzelenSummeMultiArr {

  public static void main(String[] args) {

    int[][] arr = {{2, 5, 3, 2}, {6, 4, 2}, {2, 10}, {2, 2, 2, 6}};
    //    int[][] arr = {{2, 4, 3, 2}, {6, 3, 2}, {2, 10}, {2, 2, 2, 6}};
    int sum = 0;
    boolean isQleich = false;

    int[] sumArr = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
      }
      sumArr[i] = sum;
      sum = 0;
    }

    for (int i : sumArr) {
      System.out.println(i + " ");
    }
    int el = sumArr[0];
    for (int i = 0; i < sumArr.length; i++) {
      if (sumArr[i] == el) {
        isQleich = true;
      } else {
        isQleich = false;
        break;
      }
    }

    if (isQleich) {
      System.out.println("„Die Summen aller 4 eindimensionalen\n" + "Arrays ist dieselbe“");
    } else {
      System.out.println("Die Summen aller 4 eindimensionalen\n" + "Arrays ist NICHT dieselbe“");
    }
  }
}
