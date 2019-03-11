import java.util.*;
public class driver {

  public static void checker(int pI, int[] data) {
    for (int i = 0; i < pI; i++) {
      if (data[i] > data[pI]) System.out.println("ERROR LEFT BOUND");
    }
    for (int i = data.length -1; i > pI; i--) {
      if (data[i] < data[pI]) System.out.println("ERROR RIGHT BOUND");
    }
  }
}
