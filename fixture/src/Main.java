import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Bursaspor");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Başakşehir");
        teams.add("Trabzonspor");
        teams.add("Antalyaspor");
        teams.add("Konyaspor");
        teams.add("Göztepe");
        // Add more teams here

        if (teams.size() % 2 != 0) {
            teams.add("Bay");
        }

        int rounds = teams.size() - 1;

        for (int round = 1; round <= rounds; round++) {
            System.out.println("Round " + round);
            for (int i = 0; i < teams.size() / 2; i++) {
                String homeTeam = teams.get(i);
                String awayTeam = teams.get(teams.size() - 1 - i);
                if (!awayTeam.equals("Bay")) {
                    System.out.println(homeTeam + " vs " + awayTeam);
                }
            }
            Collections.rotate(teams.subList(1, teams.size()), 1);
        }
    }
}

