public class Main {
  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();

    // treeSet.add(5);
    // treeSet.add(2);
    // treeSet.add(10);
    // treeSet.add(7);
    // treeSet.add(6);
    // treeSet.add(11);

    treeSet.add(1);
    treeSet.add(2);
    treeSet.add(3);

    treeSet.print();
    treeSet.rotateRightNode(treeSet.find(1));
    System.out.println();
    treeSet.print();
  }
}
