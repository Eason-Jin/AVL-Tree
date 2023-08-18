public class Main {
  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();

    treeSet.add(20);
    treeSet.add(10);
    treeSet.add(30);
    treeSet.add(5);
    treeSet.add(15);

    treeSet.print();

    treeSet.remove(30);
    treeSet.print();
  }
}
