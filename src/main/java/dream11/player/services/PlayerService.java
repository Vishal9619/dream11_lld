package main.java.dream11.player.services;

import main.java.dream11.player.models.Player;
import main.java.models.playerType.PlayerType;
import main.java.storage.StorageService;

public class PlayerService {

    StorageService storageService;

    public PlayerService(StorageService storageService) {
        this.storageService = storageService;
    }

    public void createPlayer(Player player, int creditScore, PlayerType playerType)
    {

    }
}
