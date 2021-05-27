package main.java.dream11.team.services;

import main.java.dream11.team.models.Team;
import main.java.dream11.user.models.User;
import main.java.storage.StorageService;


public class TeamService {

    public TeamService(StorageService storageService) {
        this.storageService = storageService;
    }

    StorageService storageService;

    public void createTeam(Team team)
    {

    }
    public void addPlayersInTeam(User user, Team team)
    {

    }
}
