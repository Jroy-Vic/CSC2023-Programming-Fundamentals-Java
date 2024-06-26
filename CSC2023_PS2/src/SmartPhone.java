
public class SmartPhone extends Phone {

    private String name;
    private String number;
    private String email;

    public String toString(){
        return "Name: " + this.name + "\n" + "Phone: " + this.number + "\n" + "Email: " + this.email + "\n";
    }

    public static char getChar(String number, int idx) {
        return number.charAt(idx);
    }
    public SmartPhone() {
        this.name = "None";
        this.number = "Not set";
        this.email = "None";
    }
    public SmartPhone(String name, String number, String email) {
       super(name, Long.parseLong(number));
       this.name = name;
       this.number = number;
       this.email = email;
    }

    public SmartPhone(String name, String number) {
        this.name = name;
        this.number = number;
        this.email = "None";
    }

    public boolean hasPhoneNumber() {
        return (number != "Not set");
    }

    public String getAreaCode() {
        char A1 = getChar(number, 0);
        char A2 = getChar(number, 1);
        char A3 = getChar(number,2);
        return "" + A1 + "" + A2 + "" + A3;
    }

    public String getPrefix() {
        char A1 = getChar(number, 3);
        char A2 = getChar(number, 4);
        char A3 = getChar(number,5);
        return "" + A1 + "" + A2 + "" + A3;
    }

    public String getLineNumber() {
        char A1 = getChar(number, 6);
        char A2 = getChar(number, 7);
        char A3 = getChar(number,8);
        char A4 = getChar(number, 9);
        return "" + A1 + "" + A2 + "" + A3 + "" + A4;
    }

    public String getTelephoneNeighbor() {
        if (number != "Not set") {
            long num = Long.parseLong(number) + 1;
            String newNum = Long.toString(num);
            char A1 = getChar(newNum, 0);
            char A2 = getChar(newNum, 1);
            char A3 = getChar(newNum, 2);
            char A4 = getChar(newNum, 3);
            char A5 = getChar(newNum, 4);
            char A6 = getChar(newNum, 5);
            char A7 = getChar(newNum, 6);
            char A8 = getChar(newNum, 7);
            char A9 = getChar(newNum, 8);
            char A10 = getChar(newNum, 9);

            return "(" + A1 + "" + A2 + "" + A3 + ")" + " " + A4 + "" + A5 + "" + A6 + "-" + A7 + "" + A8 + "" + A9 + "" + A10;

        } else {
            return "Cannot calculate phone number neighbor";
        }
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}

