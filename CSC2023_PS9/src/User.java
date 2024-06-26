public class User<T> implements Comparable<User>{
    private T username;
    private T password;

    public void setData(T name, T pass) {
        this.username = name;
        this.password = pass;
    }

    public T getUsername() {
        return this.username;
    }

    public T getPassword() {
        return this.password;
    }

    @Override
    public int compareTo(User o) {
        int passVal1 = this.password.toString().length();
        int passVal2 = o.getPassword().toString().length();

        if (passVal1 == passVal2) {
            String passString1 = this.password.toString();
            String passString2 = o.getPassword().toString();
            if (passString1.compareToIgnoreCase(passString2) < 0) {
                return -1;
            }
            else if (passString1.compareToIgnoreCase(passString2) == 0) {
                String nameString1 = this.username.toString();
                String nameString2 = o.getUsername().toString();
                return nameString1.compareToIgnoreCase(nameString2);
            }
            else {
                return 1;
            }
        }
        else {
            if (passVal1 < passVal2) {
                return -1;
            }
            else {
                return 1;
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%20s%20s",getPassword(),getUsername());
    }
}
