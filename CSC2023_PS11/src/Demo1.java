import java.util.AbstractList;

public class Demo1 {
  public static void main(String[] args) {
    AbstractList<String> list = TestBench.buildList();
    TestBench.test(list);
  }
}
