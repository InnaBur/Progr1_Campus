package Part2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Fibonacci {

  public static void main(String[] args) {

    int[] fib = new int[20];

    for (int i = 0; i < 20; i++) {

      if (i < 2) {
        fib[i] = i;
      } else {
        fib[i] = fib[i - 1] + fib[i - 2];
      }
    }
    System.out.println(Arrays.toString(fib));
  }
}
