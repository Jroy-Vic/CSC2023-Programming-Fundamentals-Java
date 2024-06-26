public class UselessKeyException extends Exception{

    private int UselessKey;

    public UselessKeyException(int key) {
        super("Error: Key is divisible by 26. That's a bad key!");
        this.UselessKey = key;
    }

    public int getUselessKey() {
        return UselessKey;
    }
}
