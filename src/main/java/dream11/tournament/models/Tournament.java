package main.java.dream11.tournament.models;

import java.util.Map;
import java.util.UUID;

public class Tournament {

    private String id;

    public Tournament(String tournamentName) {
        this.id = UUID.randomUUID().toString();
        this.tournamentName = tournamentName;
//        this.tournamentScore = tournamentScore;
    }

    private String tournamentName;
    Map<String, Integer> tournamentScore;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public Map<String, Integer> getTournamentScore() {
        return tournamentScore;
    }

    public void setTournamentScore(Map<String, Integer> tournamentScore) {
        this.tournamentScore = tournamentScore;
    }
}
