public class Game {
    private final String homeTeam;
    private final String awayTeam;
    private final int homeGoals;
    private final int awayGoals;

    public Game(String homeTeam, String awayTeam, int homeGoals, int awayGoals) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public String getResultForTeam(String teamName) {
        if (teamName.equalsIgnoreCase(homeTeam)) {
            if (homeGoals > awayGoals) return "win";
            else if (homeGoals < awayGoals) return "loss";
            else return "draw";
        } else if (teamName.equalsIgnoreCase(awayTeam)) {
            if (awayGoals > homeGoals) return "win";
            else if (awayGoals < homeGoals) return "loss";
            else return "draw";
        }
        return null;
    }
}
