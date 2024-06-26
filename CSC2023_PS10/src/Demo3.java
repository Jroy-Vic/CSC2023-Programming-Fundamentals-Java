import java.util.List;
import java.util.Scanner;

public class Demo3
{
  public static void main(String[] args) {
    System.out.println("How many primes do you want?");
    Scanner keyboard = new Scanner(System.in);
    int howMany = keyboard.nextInt();
    List<Long> data = PrimeNumberGenerator.generate(howMany);
    for (Long current : data)
    {
      System.out.println(current);
    }
  }

}
