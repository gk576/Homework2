import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[5];

        // Sample data
        cars[0] = new Car("ABC123", "Toyota Corolla", 15000);
        cars[1] = new Car("DEF456", "Honda Civic", 20000);
        cars[2] = new Car("GHI789", "Ford Mustang", 10000);
        cars[3] = new Car("JKL012", "BMW 3 Series", 30000);
        cars[4] = new Car("MNO345", "Tesla Model S", 5000);

        int choice;
        do {
            System.out.println("\n--- CAR RENTAL MENU ---");
            System.out.println("1. Rent a car");
            System.out.println("2. Return a car");
            System.out.println("3. Display all cars");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter plate number to rent: ");
                    String plateRent = scanner.next();
                    boolean foundRent = false;
                    for (Car car : cars) {
                        if (car.getPlateNumber().equalsIgnoreCase(plateRent)) {
                            car.rentCar();
                            foundRent = true;
                            break;
                        }
                    }
                    if (!foundRent) System.out.println("Car not found.");
                    break;

                case 2:
                    System.out.print("Enter plate number to return: ");
                    String plateReturn = scanner.next();
                    System.out.print("Enter new km reading: ");
                    int newKm = scanner.nextInt();
                    boolean foundReturn = false;
                    for (Car car : cars) {
                        if (car.getPlateNumber().equalsIgnoreCase(plateReturn)) {
                            car.returnCar(newKm);
                            foundReturn = true;
                            break;
                        }
                    }
                    if (!foundReturn) System.out.println("Car not found.");
                    break;

                case 3:
                    System.out.println("\nCurrent car fleet:");
                    for (Car car : cars) {
                        System.out.println(car);
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
