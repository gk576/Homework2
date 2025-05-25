import java.util.Scanner;

public class PetClinic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet[] pets = new Pet[10];

        // Initialize sample data
        pets[0] = new Pet("dog", "Pluto");
        pets[1] = new Pet("cat", "Whiskers");
        pets[2] = new Pet("dog", "Jack");
        pets[3] = new Pet("dog", "Milo");
        pets[4] = new Pet("duck", "Daffy");
        pets[5] = new Pet("rabbit", "Bugs");
        pets[6] = new Pet("turtle", "Speedy");
        pets[7] = new Pet("cat", "Mittens");
        pets[8] = new Pet("duck", "Donald");
        pets[9] = new Pet("rabbit", "Roger");

        System.out.print("Give type: ");
        String type = scanner.nextLine().trim().toLowerCase();

        int count = 0;
        System.out.print(type + " - ");

        for (Pet pet : pets) {
            if (pet.getSpecies().equalsIgnoreCase(type)) {
                System.out.print(pet.getName() + " - ");
                count++;
            }
        }

        System.out.println("\nTotal animals of " + type + " type: " + count);
    }
}