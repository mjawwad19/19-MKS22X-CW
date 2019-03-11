import java.util.*;
public class partition{
    /*Modify the array such that:
   *1. Only the indices from start to end inclusive are considered in range
   *2. A random index from start to end inclusive is chosen, the corresponding
   *   element is designated the pivot element.
   *3. all elements in range that are smaller than the pivot element are placed before the pivot element.
   *4. all elements in range that are larger than the pivot element are placed after the pivot element.
   *@return the index of the final position of the pivot element.
   */
  public static void partition ( int [] data, int start, int end){
    int index = (int) (Math.random() * (end - start + 1) + start);
    // choose a random index that is not start nor end (or attempt not to, as discussed in class)
    int pivot = data[index];
    //pivot is what we will use the separate the data that is less or greater. We temporarily store since swapping is involved for constant time!
    data[index] = data[0];
    data[0] = pivot;
    System.out.println(Arrays.toString(data));
    start++; //we will not include pivot till later.

    if (data[start] < pivot) {
      data[0] = data[start];
      data[start] = pivot;
    }
    System.out.println(Arrays.toString(data));
  }

  public static void main(String[] args) {
    int[] data = {8, 6, 7, 5, 3, 0, 9};
    partition(data, 0, data.length -1);
    System.out.println(Arrays.toString(data));
    //index should be at the front right now and 8 in index's place;
  }
}
