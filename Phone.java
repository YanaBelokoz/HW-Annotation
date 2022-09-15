public class Phone {
    @Annotation("brand")
    private static String make;

    @Annotation
    private static String model;
    private int year;
    private static String color;

    public void setMake(String make) {
        Phone.make = make;
    }

    public void setModel(String model) {
        Phone.model = model;
    }
    public void setYear(int year) {

        this.year = year;
    }

    public void setColor(String color) {
        Phone.color = color;
    }

    public Phone() {
        public Phone(String make, String model, int year, String color) {
            make = make;
            model = model;
            this.year = year;
            color = color;
        }

        public String getMake() {
            return;
        }

        public String getModel() {
            return;
        }

        public int getYear() {
            return;
        }

        public String getColor() {
            return;
        }

        public String toString() {
        }
    }
    @Override
    public String toString() {
        return "Phone{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", fuel='" + color + '\'' +
                '}';
    }

}
