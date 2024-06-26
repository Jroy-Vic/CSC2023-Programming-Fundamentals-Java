import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Cipher {

    private String text;
    private int key;
    private String decryptText = "";

    private ArrayList<Character> alphabet = new ArrayList<>(List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'));


    public Cipher(String text, int key) throws UselessKeyException, EmptyPlainText {
        this.text = text;
        this.key = key;
        int newKey = key;

        if(text.length() == 0) {
            throw new EmptyPlainText();
        }

        if((key % 26) == 0) {
            throw new UselessKeyException(key);
        }
        else if(key > 26) {
            newKey = key - 26;
            while(newKey > 26) {
                newKey -= 26;
            }
        }
        else if(key < 0) {
            newKey = 27 + key;
            while(newKey < 0) {
                newKey += 27;
            }
        }

        for(int i = 0; i < text.length(); i++) {
            char newChar;
            char prevChar = text.charAt(i);
            if(Character.isLetter(text.charAt(i))) {
                newChar = (char)(Character.toLowerCase(prevChar) + newKey);

                if(!(Character.isLetter(newChar))) {
                    for (int x = 0; x < alphabet.size(); x++) {
                        if(alphabet.get(x) == Character.toLowerCase(prevChar)) {
                            newChar = alphabet.get((x + key) % 26);
                        }
                    }
                }

                if(Character.isUpperCase(prevChar)) {
                    newChar = Character.toUpperCase(newChar);
                }

            }

            else {
                newChar = (char)(text.charAt(i) + newKey);
            }

            this.decryptText += newChar;
        }

    }

    public String getPlainText() {
        return this.text;
    }

    public String getCipherText() {
        return this.decryptText;
    }

    public int getKey() {
        return this.key;
    }

}
