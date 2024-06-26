import javax.tools.Tool;
import java.util.ArrayList;
import java.util.List;

public class Question1 {
  public static void main(String[] args) {
    GenericTools t = new ToolBox();
    ArrayList<String> data = new ArrayList<>();
    data.add("Carlos");
    data.add("Alice");
    data.add("Bob");
    data.add("Zebra");
    data.add("Fred");

    t.insertionSort(data);
    data.forEach(x -> System.out.println(x));

    System.out.println("---");
    t.insertionSort(data, 1, 4).forEach(x -> System.out.println(x));

    System.out.println("---");
    t.insertionSort(data, 2, 4).forEach(x -> System.out.println(x));
  }
}
