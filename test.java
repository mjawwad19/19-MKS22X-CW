import java.util.*;
public class test{
  public static List<String> makeAllWords(int k, int maxLetter) {
    ArrayList<String> lo = new ArrayList<String>();
    f(k,lo, maxLetter, "");
    return lo;
  }

  private static void f(int k, ArrayList<String> l, int maxL, String word) {
    if (k == 0) l.add(word);
    else {
      for (int i = 0; i < maxL; i++) {
        f(k-1, l, maxL, word + (char) (97 + i))
      }
    }
  }
  public static void main(String[] args) {
    System.out.println(makeAllWords(1,26));/*returns the list:
    ["a","b","c",..."z"]*/

System.out.println(makeAllWords(2,26));/* returns the list:
    ["aa","ab","ac",..."az",
     "ba","bb","bc",..."bz",
     ...
     "za","zb","zc",..."zz"]
*/
System.out.println(makeAllWords(3,3));/*returns the list:
    ["aaa","aab","aac",
     "aba","abb","abc",
     ...
     "cca","ccb","ccc"]
*/
System.out.println(makeAllWords(4,2)); /*returns the list:
    ["aaaa","aaab"
     "aaba","aabb"
     ...
     "bbaa","bbab",
     "bbba","bbbb"]*/
  }
}
