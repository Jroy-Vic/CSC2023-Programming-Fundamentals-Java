import java.io.File;

public class Display {

    protected File carFile;
    protected String make = "", model = "", year = "", VIN = "";


    public Display(String fileName) {
        carFile = new File(fileName);
    }

    public void getVar(String line) {
        int count = 0;
        make = "";
        model = "";
        year = "";
        VIN = "";

        for (int x = 0; x < line.length(); x++) {
            if (line.charAt(x) == ',' && count == 0)  {
                    count++;
            }
            else if (count == 0) {
                make += line.charAt(x);
            }
            else if (line.charAt(x) == ','  && count == 1) {
                count++;
            }
            else if (count == 1) {
                model += line.charAt(x);
            }
            else if (line.charAt(x) == ','  && count == 2) {
                count++;
            }
            else if (count == 2) {
                year += line.charAt(x);
            }
            else if (count == 3) {
                VIN += line.charAt(x);
            }
        }
    }

}
