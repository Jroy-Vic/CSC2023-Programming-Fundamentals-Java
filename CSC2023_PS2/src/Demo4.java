public class Demo4 {

    public static void main(String[] args) {
        SmartPhone test1 = new SmartPhone("Bret", "1234567890");
        SmartPhone test2 = new SmartPhone("Alice", "8059226966", "info@test.com");
        SmartPhone test3 = new SmartPhone();
        SmartPhone test4 = new SmartPhone("Carlos", "8189998999", "test@example.com");
        SmartPhone test5 = new SmartPhone("Dan", "8182293899", "hello@example.com");

        System.out.print(test1);
        System.out.println("Telephone neighbor: " + test1.getTelephoneNeighbor());
        System.out.println();

        System.out.print(test2);
        System.out.println("Telephone neighbor: " + test2.getTelephoneNeighbor());
        System.out.println();

        System.out.print(test3);
        System.out.println("Telephone neighbor: " + test3.getTelephoneNeighbor());
        System.out.println();

        System.out.print(test4);
        System.out.println("Telephone neighbor: " + test4.getTelephoneNeighbor());
        System.out.println();

        System.out.print(test5);
        System.out.println("Telephone neighbor: " + test5.getTelephoneNeighbor());
        System.out.println();
    }

}
