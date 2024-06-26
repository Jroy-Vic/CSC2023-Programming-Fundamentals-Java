public class NewCar {

    private String make, model, year, VIN;

    public NewCar(String make, String model, String year, String VIN) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.VIN = VIN;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getYear() {
        return this.year;
    }

    public String getVIN() {
        return this.VIN;
    }

    public int compareToMake(NewCar o) {
        return this.getMake().compareToIgnoreCase(o.getMake());
    }

    public int compareToModel(NewCar o) {
        return this.getModel().compareToIgnoreCase(o.getModel());
    }

    public int compareToYear(NewCar o) {
        return this.getYear().compareToIgnoreCase(o.getYear());
    }

    public int compareToVIN(NewCar o) {
        return this.getVIN().compareToIgnoreCase(o.getVIN());
    }
}
