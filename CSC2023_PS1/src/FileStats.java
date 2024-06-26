import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStats {

    private String filename;
    static Scanner fRead;

    public FileStats(String filename) {
        this.filename = filename;
    }

    public int getNumMatchingWords(String key) throws FileNotFoundException {
        File f = new File(filename);
        fRead = new Scanner(f);

        int sum = 0;
        while(fRead.hasNext()) {
            String word = fRead.nextLine();
            if(word.toLowerCase().contains(key.toLowerCase())) {
                sum++;
            }
        }
        fRead.close();

        return sum;
    }

    public int getNumLines() throws FileNotFoundException {
        File f = new File(filename);
        Scanner fRead = new Scanner(f);

        int lines = 0;
        while(fRead.hasNext()) {
            fRead.nextLine();
            lines++;
        }
        fRead.close();

        return lines;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter a filename");
        fRead = new Scanner(System.in);
        String fileName = fRead.nextLine();
        FileStats f = new FileStats(fileName);

        System.out.println(f.filename + " has " + f.getNumLines() + " lines");

        System.out.println("Enter some text");
        String key = fRead.nextLine();

        System.out.println(f.getNumMatchingWords(key) + " line(s) contain " + "\"" + key + "\"");

    }
}
