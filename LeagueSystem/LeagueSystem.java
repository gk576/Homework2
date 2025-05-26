import java.util.ArrayList;
import java.util.Scanner;

public class LeagueSystem {
    private final ArrayList<Game> games;

    public LeagueSystem() {
        games = new ArrayList<>();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Football League Game ---");
            System.out.println("1. Add Game");
            System.out.println("2. Team Performance");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addGame(scanner);
                    break;
                case 2:
                    displayTeamPerformance(scanner);
                    break;
                case 0:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }

    private void addGame(Scanner scanner) {
        scanner.nextLine(); // consume newline

        System.out.print("Enter home team name: ");
        String homeTeam = scanner.nextLine();

        System.out.print("Enter away team name: ");
        String awayTeam = scanner.nextLine();

        System.out.print("Enter home team goals: ");
        int homeGoals = scanner.nextInt();

        System.out.print("Enter away team goals: ");
        int awayGoals = scanner.nextInt();

        games.add(new Game(homeTeam, awayTeam, homeGoals, awayGoals));
        System.out.println("Game added successfully!");
    }

    private void displayTeamPerformance(Scanner scanner) {
        scanner.nextLine(); // consume newline

        System.out.print("Enter team name: ");
        String teamName = scanner.nextLine();

        int wins = 0, losses = 0, draws = 0;

        for (Game game : games) {
            String result = game.getResultForTeam(teamName);
            if (result != null) {
                switch (result) {
                    case "win": wins++; break;
                    case "loss": losses++; break;
                    case "draw": draws++; break;
                }
            }
        }

        System.out.println("\n--- Performance for " + teamName + " ---");
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
    }

    public static void main(String[] args) {
        LeagueSystem system = new LeagueSystem();
        system.start();
    }
}