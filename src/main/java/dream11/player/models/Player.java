package main.java.dream11.player.models;

import main.java.models.playerType.PlayerType;

public class Player {
    String playerId;
    String playerName;
    int creditScore;

    public Player(String playerName, int creditScore, PlayerType playerType) {
        this.playerName = playerName;
        this.creditScore = creditScore;
        this.playerType = playerType;
    }

    PlayerType playerType;

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
