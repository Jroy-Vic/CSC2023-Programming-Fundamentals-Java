public class Demo5 {
  public static void main(String[] args) {
    MyLinkedList<String> list = new MyLinkedList<>();

    list.add("B");
    list.add("C");
    list.add("A");
    list.add("D");
    list.add("E");
    System.out.println("Original");
    System.out.println(list);

    System.out.println("Removing minimum");
    System.out.println("Removing: " + list.removeMinimum());
    System.out.println(list);

    System.out.println("Removing minimum again");
    System.out.println("Removing: " + list.removeMinimum());
    System.out.println(list);

    System.out.println("Removing minimum again");
    System.out.println("Removing: " + list.removeMinimum());
    System.out.println(list);

    System.out.println("Removing minimum again");
    System.out.println("Removing: " + list.removeMinimum());
    System.out.println(list);

    System.out.println("Removing minimum again");
    System.out.println("Removing: " + list.removeMinimum());
    System.out.println(list);

    System.out.println("Removing minimum again (but list is empty!)");
    System.out.println("Removing: " + list.removeMinimum());
    System.out.println(list);

    System.out.println("Adding lots of stuff and shuffling");
    TestBench.addToList(list);
    TestBench.addToList(list);
    TestBench.addToList(list);
    list.shuffle(777);
    System.out.println(list);

    for (int x = 1; x <= 10; x++) {
      System.out.println("Removing minimum - Iteration " + x);
      System.out.println("Removing: " + list.removeMinimum());
      System.out.println(list);
    }
  }
}
