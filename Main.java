public class Main {
  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();

    int n = 10;
    for (int i = n - 1; i >= 0; i--) {
      treeSet.add(i);
    }

    treeSet.print();
  }
}
