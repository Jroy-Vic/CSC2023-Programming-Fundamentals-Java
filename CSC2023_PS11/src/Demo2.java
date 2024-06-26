import java.util.Scanner;

public class Demo2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter seed for random number generator");
    long x = keyboard.nextLong();

    MyLinkedList<String> list = new MyLinkedList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.add("D");
    list.add("E");
    System.out.println("Not shuffled");
    System.out.println(list);

    System.out.println("Shuffle 1");
    list.shuffle(x);
    System.out.println(list);

    System.out.println("Shuffle 2");
    list.shuffle(x + 10);
    System.out.println(list);

    System.out.println("Shuffle 3");
    list.shuffle(x + 100);
    System.out.println(list);

    System.out.println("Shuffle 4");
    list.shuffle(x + 1000);
    System.out.println(list);

    list.clear();
    TestBench.addToList(list);

    System.out.println("Not shuffled");
    System.out.println(list);

    System.out.println("Shuffle 1");
    list.shuffle(x);
    System.out.println(list);

    System.out.println("Shuffle 2");
    list.shuffle(x + 10);
    System.out.println(list);

    System.out.println("Shuffle 3");
    list.shuffle(x + 100);
    System.out.println(list);

    System.out.println("Shuffle 4");
    list.shuffle(x + 1000);
    System.out.println(list);
  }
}
