import java.io.FileNotFoundException;

public class FileStatsDemo
{
    public static void main(String[] args) throws FileNotFoundException {

        FileStats billOfRights = new FileStats("bill-of-rights.txt");
        FileStats romeoAndJuliet = new FileStats("romeo-and-juliet.txt");
        FileStats dictionary = new FileStats("dictionary.txt");

        System.out.println("Num lines in Bill of Rights: " + billOfRights.getNumLines());
        System.out.println("Num lines in Romeo and Juliet: " + romeoAndJuliet.getNumLines());
        System.out.println("Num lines in dictionary: " + dictionary.getNumLines());

        System.out.println("-- Bill of Rights Test --");
        System.out.println("'the' count: " + billOfRights.getNumMatchingWords("the"));
        System.out.println("'no' count: " + billOfRights.getNumMatchingWords("no"));
        System.out.println("'rights' count: " + billOfRights.getNumMatchingWords("rights"));

        System.out.println("-- Romeo and Juliet Test --");
        System.out.println("'Romeo' count: " + romeoAndJuliet.getNumMatchingWords("ROMEO"));
        System.out.println("'Juliet' count: " + romeoAndJuliet.getNumMatchingWords("juliet"));
        System.out.println("'end' count: " + romeoAndJuliet.getNumMatchingWords("end"));
        System.out.println("'emoji' count: " + romeoAndJuliet.getNumMatchingWords("emoji"));

    }
}
