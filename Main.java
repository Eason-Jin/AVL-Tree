public class Main {
  public static void main(String[] args) {
    TreeSet treeSet = new TreeSet();

    treeSet.add(5);
    treeSet.add(2);
    treeSet.add(10);
    treeSet.add(8);
    treeSet.add(7);
    treeSet.add(11);
    treeSet.add(6);

    treeSet.print();
    
    treeSet.remove(5);
    treeSet.print();
  }
}
