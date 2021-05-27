package main.java.dream11.team.models;

import main.java.dream11.player.models.Player;

import java.util.List;

public class Team {
    String teamId;
    String teamName;
    String tournamentId;
    long totalScore;
    long totalcreditScore;
    List<Player> player;

    public Team(String teamName, String tournamentId, long totalcreditScore, List<Player> player) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.tournamentId = tournamentId;
        this.player = player;
        this.totalcreditScore = totalcreditScore;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    public long getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(long totalScore) {
        this.totalScore = totalScore;
    }

    public long getTotalcreditScore() {
        return totalcreditScore;
    }

    public void setTotalcreditScore(long totalcreditScore) {
        this.totalcreditScore = totalcreditScore;
    }
}
