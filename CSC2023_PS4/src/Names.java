import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Names {

    private int count;
    private FileInputStream file;
    private DataInputStream data;
    private static ArrayList<String> nameList = new ArrayList<>();


    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a length");
        int length = keyboard.nextInt();
        System.out.println("Names of length " + length);

        Names test = new Names();
        test.createNames();
        test.selectNames(length);
        System.out.println(test.count + " results");

    }

    public void createNames() throws FileNotFoundException {
        file = new FileInputStream("names.dat");
        data = new DataInputStream(file);

        boolean eof = false;
        String name = "";
        while (!eof) {
            try {
                char character = data.readChar();
                if(Character.isLetter(character) || character == ' ') {
                    name += character;
                }
                else {
                    if(name.length() > 0  && Character.isUpperCase(name.charAt(0))) {
                        nameList.add(name);
                        name = "";
                    }
                    else {
                        name = "";
                    }
                }
            } catch (EOFException e) {
                nameList.add(name);
                eof = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void selectNames(int length) {
        for(int i = 0; i < nameList.size(); i++) {
            char lastLetter = nameList.get(i).charAt(nameList.get(i).length() - 1);
            if(nameList.get(i).length() == length && Character.isLowerCase(lastLetter)) {
                System.out.println(nameList.get(i));
                this.count++;
            }
        }
    }
}
