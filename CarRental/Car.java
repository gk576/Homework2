public class Car {
    private final String plateNumber;
    private final String model;
    private int kilometers;
    private boolean isRented;

    public Car(String plateNumber, String model, int kilometers) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.kilometers = kilometers;
        this.isRented = false;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return model;
    }

    public int getKilometers() {
        return kilometers;
    }

    public boolean isRented() {
        return isRented;
    }

    public void rentCar() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car " + plateNumber + " has been rented.");
        } else {
            System.out.println("Car " + plateNumber + " is already rented.");
        }
    }

    public void returnCar(int newKm) {
        if (isRented) {
            kilometers = newKm;
            isRented = false;
            System.out.println("Car " + plateNumber + " returned. New km: " + kilometers);
        } else {
            System.out.println("Car " + plateNumber + " is not currently rented.");
        }
    }

    @Override
    public String toString() {
        return "Plate: " + plateNumber +
                ", Model: " + model +
                ", KM: " + kilometers +
                ", Rented: " + (isRented ? "Yes" : "No");
    }
}