public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public Car(String make, String model, String color, int doors, boolean convertible) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.doors = doors;
        this.convertible = convertible;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String lowercaseMake = make.toLowerCase();
        switch (lowercaseMake) {
            case "holden", "porsche", "telsa" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void describeCar() {
        System.out.println(doors + "-Door " + color + " " +
                make + " " + model + " " +
                (convertible ? "Convertible" : ""));
    }
}
