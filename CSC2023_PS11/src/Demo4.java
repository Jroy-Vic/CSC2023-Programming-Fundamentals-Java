public class Demo4 {
  public static void main(String[] args) {
    MyLinkedList<String> list = new MyLinkedList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    System.out.println("Not reversed");
    System.out.println(list);
    System.out.println("Reverse");
    list.reverse();
    System.out.println(list);
    System.out.println("Reverse again");
    list.reverse();
    System.out.println(list);

    System.out.println("Add elements and shuffle");
    TestBench.addToList(list);
    list.shuffle(999);
    System.out.println(list);

    System.out.println("Reverse");
    list.reverse();
    System.out.println(list);

    System.out.println("Sort");
    list.sort();
    System.out.println(list);

    System.out.println("Reverse");
    list.reverse();
    System.out.println(list);
  }
}
